package com.concretepage.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IChargeDAO;
import com.concretepage.dao.IMenuDAO;
import com.concretepage.entity.Menu;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.concretepage.dao.ISessionDAO;
import com.concretepage.entity.Session;
import com.concretepage.util.XMLUtil;

@Service
public class MenuService implements IMenuService {
	@Autowired
	private IMenuDAO menuDAO;
	@Autowired
	private ISessionDAO sessionDAO;
	@Autowired
	private IChargeDAO chargeDAO;
	@Override
	public Menu getMenuById(int id) {
		Menu obj = menuDAO.getMenuByStageId(id);
		return obj;
	}
	@Override
	public Menu getInitMenuXML(int id,HttpServletRequest request) {
		//persist new session to database
		Session session = new Session();
		Timestamp start_date = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		String session_id = request.getParameter("usid");		
		if(session_id != null){
			System.out.println("Initiating Logging Session Details");
			session.setSessionId(session_id);
			session.setStartDate(start_date);
			session.setStatus(1);
			session.setMsisdn(request.getParameter("msisdn"));
			session.setShortCode(request.getParameter("shortCode"));
			session.setCountry(request.getParameter("countryName"));
			session.setNetwork(request.getParameter("networkName"));			
			System.out.println("Done Logging Session Details");
			sessionDAO.addSession(session);			
			
			Menu obj = menuDAO.getInitMenuXML(id);
			return obj;
		}else{
			Menu obj = menuDAO.getInitMenuXML(6);
			return obj;
		}
		
	}
	@Override
	public synchronized boolean addMenu(Menu menu){
       if (menuDAO.menuExists(menu.getId())) {
    	   return false;
       } else {
    	   menuDAO.addMenu(menu);
    	   return true;
       }
	}
	@Override
	public void updateMenuOnExit(String service_id, HttpServletRequest request) {
		Session session = new Session();
		String session_id = request.getParameter("usid");
		Timestamp end_date = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		if(session_id != null){
			String message = request.getParameter("statusMessage");
			String exit_code = request.getParameter("statusCode");
			if (exit_code.contentEquals("200")){
				session.setStatus(0);
			}else{
				session.setStatus(-1);
			}
			session.setExitCode(exit_code);
			session.setMessage(message);
			session.setSessionId(session_id);
			session.setEndDate(end_date);
		}else{
			//Set exit code to invalid
		}
		sessionDAO.updateSession(session);
	}
	@Override
	public String getMenuByStageId(HttpServletRequest request, int stage_id) {
		String session_id = request.getParameter("usid");
		XMLUtil util = new XMLUtil();
		if(session_id != null){
			String obj = "";
			switch(stage_id){
			case 2:
				System.out.println("Login requested");
				break;
			case 3:
				System.out.println("Login redirect requested");
				String pin = request.getParameter("personalPin");
				String pin_tries = request.getParameter("pin_retries");
				System.out.println("Verying mPIN: " + pin);
				if(pin.contentEquals("1234")){
					System.out.println("Successful Login....Redirecting to services");
					List<String> element = new ArrayList<String>();
					List<String> values = new ArrayList<String>();					
					element.add(0, "account");
					element.add(1, "account");					
					values.add(0, "0170190906282");
					values.add(1, "035000022424");
					obj = util.enrichServiceXML(menuDAO.getInitMenuXML(4).getXmlPayLoad(), "variables", element, values);					
				}else{
					System.out.println("Ivalid Login....Redirecting to pin retry");
					obj = menuDAO.getInitMenuXML(3).getXmlPayLoad();
				}				
				break;
			case 4:
				System.out.println("Initiating balance check");
				String mpin = request.getParameter("personalPin");
				String account = request.getParameter("personalPin");				
				if(mpin != null && account != null){
					//perform balance check
					obj = menuDAO.getInitMenuXML(5).getXmlPayLoad();
				}else{
					System.out.println("Request....Killing session");
					obj = menuDAO.getInitMenuXML(0).getXmlPayLoad();
				}
				break;
			case 5:
				System.out.println("Initiating charges fetch......");
				String service = request.getParameter("serviceSelected");
				if(service != null){
					if(service.contentEquals("Check Balance")){
						obj = util.enrichChargeXML(menuDAO.getInitMenuXML(7).getXmlPayLoad(), "variables", String.valueOf(chargeDAO.getChargeById(1).getAmount()));
					}else{
						obj = util.enrichChargeXML(menuDAO.getInitMenuXML(7).getXmlPayLoad(), "variables", String.valueOf(chargeDAO.getChargeById(3).getAmount()));
					}
				}else{
					System.out.println("Invalid request....Killing session");
					obj = menuDAO.getInitMenuXML(0).getXmlPayLoad();
				}
				break;
			default:
				System.out.println("Invalid Stage Requested");				
				obj = menuDAO.getInitMenuXML(0).getXmlPayLoad();				
			}			
			return obj;
		}else{
			String obj = menuDAO.getInitMenuXML(0).getXmlPayLoad();
			return obj;
		}		
	}
}

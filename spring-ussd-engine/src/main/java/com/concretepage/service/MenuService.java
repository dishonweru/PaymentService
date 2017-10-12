package com.concretepage.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IMenuDAO;
import com.concretepage.entity.Menu;

import java.sql.*;
import java.util.Calendar;

import com.concretepage.dao.ISessionDAO;
import com.concretepage.entity.Session;

@Service
public class MenuService implements IMenuService {
	@Autowired
	private IMenuDAO menuDAO;
	@Autowired
	private ISessionDAO sessionDAO;
	@Override
	public Menu getMenuById(int id) {
		Menu obj = menuDAO.getMenuById(id);
		return obj;
	}
	@Override
	public Menu getInitMenuXML(int id,HttpServletRequest request) {
		//persist new session to database
		Session session = new Session();
		Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		String session_id = request.getParameter("usid");		
		if(session_id != null){
			System.out.println("Initiating Logging Session Details");
			session.setSessionId(session_id);
			session.setStartDate(currentTimestamp);
			session.setStatus(0);
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
	public void updateMenu(Menu menu) {
		menuDAO.updateMenu(menu);
	}
	@Override
	public String getMenuByStageId(HttpServletRequest request, int stage_id) {
		String session_id = request.getParameter("usid");
		if(session_id != null){
			Menu obj = null;
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
					obj = menuDAO.getInitMenuXML(8);					
				}else{
					System.out.println("Ivalid Login....Redirecting to pin retry");
					obj = menuDAO.getInitMenuXML(7);
				}				
				break;
			case 4:
				System.out.println("Initiating balance check");
				String mpin = request.getParameter("personalPin");
				String account = request.getParameter("personalPin");				
				if(mpin != null && account != null){
					//perform balance check
					obj = menuDAO.getInitMenuXML(9);
				}else{
					System.out.println("Request....Killing session");
					obj = menuDAO.getInitMenuXML(0);
				}
				break;
			default:
				System.out.println("Invalid Stage Requested");				
				obj = menuDAO.getInitMenuXML(6);				
			}			
			return obj.getXmlPayLoad();
		}else{
			Menu obj = menuDAO.getInitMenuXML(0);
			return obj.getXmlPayLoad();
		}		
	}
}

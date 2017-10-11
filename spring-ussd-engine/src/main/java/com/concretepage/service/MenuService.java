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
		if(request.getParameter("usid") != null){
			session.setSessionId(request.getParameter("usid"));
			session.setStartDate(currentTimestamp);
			session.setStatus(0);
			session.setMsisdn(request.getParameter("msisdn"));
			session.setShortCode(request.getParameter("shortCode"));
			session.setCountry(request.getParameter("countryName"));
			session.setNetwork(request.getParameter("networkName"));
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
		return null;
	}
}

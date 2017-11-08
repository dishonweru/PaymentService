package com.concretepage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IArticleDAO;
import com.concretepage.dao.ISessionDAO;
import com.concretepage.entity.Article;
import com.concretepage.entity.Session;
@Service
public class SessionService implements ISessionService {
	@Autowired
	private ISessionDAO sessionDAO;
	@Override
	public Session getSessionById(String session_id) {
		Session obj = sessionDAO.getSessionById(session_id);
		return obj;
	}
	@Override
	public synchronized boolean addSession(Session session){
       if (sessionDAO.sessionExists(session.getSessionId())) {
    	   return false;
       } else {
    	   sessionDAO.addSession(session);
    	   return true;
       }
	}
	@Override
	public void updateSession(Session session) {
		sessionDAO.updateSession(session);
	}
}

package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Session;;
@Transactional
@Repository
public class SessionDAO implements ISessionDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public Session getSessionById(String session_id) {
		return entityManager.find(Session.class, session_id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public void addSession(Session session) {
		entityManager.persist(session);
	}
	@Override
	public void updateSession(Session session) {
		Session sessn = getSessionById(session.getSessionId());
		sessn.setExitCode(session.getExitCode());
		sessn.setStatus(session.getStatus());
		sessn.setEndDate(session.getEndDate());
		sessn.setMessage(session.getMessage());
		sessn.setPinTries(session.getPinTries());
		entityManager.flush();
	}
	@Override
	public boolean sessionExists(String session_id) {
		String hql = "FROM ussd_session as sess WHERE sess.session_id = ?";
		int count = entityManager.createQuery(hql).setParameter(1, session_id)
		              .getResultList().size();
		return count > 0 ? true : false;
	}
}

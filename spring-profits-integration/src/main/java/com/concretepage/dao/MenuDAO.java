package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Article;
import com.concretepage.entity.Menu;
@Transactional
@Repository
public class MenuDAO implements IMenuDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public Menu getMenuByStageId(int stage_id) {
		return entityManager.find(Menu.class, stage_id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public Menu getInitMenuXML(int id) {
		return entityManager.find(Menu.class, id);
	}
	@Override
	public void addMenu(Menu menu) {
		entityManager.persist(menu);
	}
	@Override
	public void updateMenu(Menu menu) {
		Menu sessn = getMenuByStageId(menu.getStageId());
		sessn.setName(menu.getName());
		sessn.setXmlPayLoad(menu.getXmlPayLoad());
		sessn.setStageId(menu.getStageId());		
		entityManager.flush();
	}
	@Override
	public boolean menuExists(int id) {
		String hql = "FROM ussd_menu as menu WHERE menu.id = ?";
		int count = entityManager.createQuery(hql).setParameter(1, id)
		              .getResultList().size();
		return count > 0 ? true : false;
	}
}

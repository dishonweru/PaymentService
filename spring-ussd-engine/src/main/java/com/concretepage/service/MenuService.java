package com.concretepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IMenuDAO;
import com.concretepage.entity.Menu;
@Service
public class MenuService implements IMenuService {
	@Autowired
	private IMenuDAO menuDAO;
	@Override
	public Menu getMenuById(int id) {
		Menu obj = menuDAO.getMenuById(id);
		return obj;
	}
	@Override
	public Menu getInitMenuXML(int id) {
		Menu obj = menuDAO.getInitMenuXML(id);
		return obj;
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
}

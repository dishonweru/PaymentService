package com.concretepage.dao;
import com.concretepage.entity.Menu;
public interface IMenuDAO {    
    void addMenu(Menu menu);
    void updateMenu(Menu menu);       
	Menu getMenuById(int id);
	boolean menuExists(int id);
	Menu getInitMenuXML(int id);
}
 
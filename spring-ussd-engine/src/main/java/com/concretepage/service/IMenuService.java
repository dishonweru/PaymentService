package com.concretepage.service;

import com.concretepage.entity.Menu;

public interface IMenuService {     
     Menu getMenuById(int id);
     Menu getInitMenuXML(int id);
     boolean addMenu(Menu menu);
     void updateMenu(Menu menu);
}

package com.concretepage.dao;
import java.util.List;
import com.concretepage.entity.Session;
public interface ISessionDAO {    
    void addSession(Session session);
    void updateSession(Session session);       
	Session getSessionById(String session_id);
	boolean sessionExists(String session_id);
}
 
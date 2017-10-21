package com.concretepage.dao;
import com.concretepage.entity.Charge;
public interface IChargeDAO {          
	Charge getChargeById(String txn_charge_id);
}
 
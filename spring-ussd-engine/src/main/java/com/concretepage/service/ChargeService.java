package com.concretepage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IChargeDAO;
import com.concretepage.entity.Charge;

@Service
public class ChargeService implements IChargeService {
	@Autowired
	private IChargeDAO chargeDAO;
	@Override
	public String getChargeById(int txn_charge_id) {
		Charge obj = chargeDAO.getChargeById(txn_charge_id);
		return String.valueOf(obj.getAmount());
	}	
}

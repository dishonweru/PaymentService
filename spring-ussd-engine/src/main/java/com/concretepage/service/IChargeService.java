package com.concretepage.service;

import javax.servlet.http.HttpServletRequest;

import com.concretepage.entity.Charge;

public interface IChargeService {     
     String getChargeById(String txn_charge_id);
}

package com.concretepage.service;

import javax.servlet.http.HttpServletRequest;

import com.concretepage.entity.Charge;

public interface IChargeService {     
     String getChargeById(int txn_charge_id);
}

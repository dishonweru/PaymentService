package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.Charge;;
@Transactional
@Repository
public class ChargeDAO implements IChargeDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public Charge getChargeById(int txn_charge_id) {
		return entityManager.find(Charge.class, txn_charge_id);
	}
}

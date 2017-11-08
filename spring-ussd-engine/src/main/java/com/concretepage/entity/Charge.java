package com.concretepage.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="txn_charge")
public class Charge implements Serializable { 
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="id")
    private int id;	
	@Column(name="txn_charge_id")
    private int txn_charge_id;
	@Column(name="txn_charge_name")
    private String txn_charge_name;
	@Column(name="ussd_code")	
	private String ussd_code;
	@Column(name="amount")
	private double amount;
	@Column(name="status")
	private int status;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getTxnChargeId() {
		return txn_charge_id;
	}
	public void setTxnChargeId(int txn_charge_id) {
		this.txn_charge_id = txn_charge_id;
	}
	public String getTxnChargeName() {
		return txn_charge_name;
	}
	public void setTxnChargeName(String txn_charge_name) {
		this.txn_charge_name = txn_charge_name;
	}
	public String getUssdCode() {
		return ussd_code;
	}
	public void setUssdCode(String ussd_code) {
		this.ussd_code = ussd_code;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
} 
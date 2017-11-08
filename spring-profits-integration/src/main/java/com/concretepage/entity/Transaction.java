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
@Table(name="txn_master")
public class Transaction implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;  
	@Column(name="txn_code")
    private String txn_code;
	@Column(name="status")	
	private String status;
	@Column(name="amount")
	private double amount;
	@Column(name="init_date")
	private Date init_date;
	@Column(name="completed_date")
	private Date completed_date;
	@Column(name="is_reversed")
	private int is_reversed;
	@Column(name="session_id")
	private String session_id;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getTxnCode() {
		return txn_code;
	}
	public void setTxnCode(String ussd_code) {
		this.txn_code = txn_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String inst_name) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getInitDate() {
		return init_date;
	}
	public void setInitDate(Date init_date) {
		this.init_date = init_date;
	}
	public Date getCompletedDate() {
		return completed_date;
	}
	public void setCompletedDate(Date completed_date) {
		this.completed_date = completed_date;
	}
	public int getIsReversed() {
		return is_reversed;
	}
	public void setIsReversed(int is_reversed) {
		this.is_reversed = is_reversed;
	}
	public String getSessionId() {
		return session_id;
	}
	public void setSessionId(String session_id) {
		this.session_id = session_id;
	}
} 
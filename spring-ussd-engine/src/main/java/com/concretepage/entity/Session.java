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
@Table(name="ussd_session")
public class Session implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;  
	@Column(name="session_id")
    private String session_id;
	@Column(name="status")	
	private int status;
	@Column(name="payment_id")
	private int payment_id;
	@Column(name="start_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date start_date;
	@Column(name="end_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date end_date;
	@Column(name="exit_code")
	private String exit_code;
	@Column(name="msisdn")
	private String msisdn;
	@Column (name="short_code")
	private String short_code;
	@Column (name="country")
	private String country;
	@Column(name="network")
	private String network;
	@Column(name="message")
	private String message;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getSessionId() {
		return session_id;
	}
	public void setSessionId(String session_id) {
		this.session_id = session_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getStartDate() {
		return start_date;
	}
	public void setStartDate(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEndDate() {
		return end_date;
	}
	public void setEndDate(Date end_date) {
		this.end_date = end_date;
	}
	public String getExitCode() {
		return exit_code;
	}
	public void setExitCode(String exit_code) {
		this.exit_code = exit_code;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getShortCode() {
		return short_code;
	}
	public void setShortCode(String short_code) {
		this.short_code = short_code;
	}
	public String getCountry(){
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
} 
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
@Table(name="ussd_menus")
public class Menu implements Serializable { 
	private static final long serialVersionUID = 1L;	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;  
	@Column(name="name")
    private String name;
	@Id
	@Column(name="stage_id")	
	private int stage_id;
	@Column(name="xml_payload")
	private String xml_payload;
	@Column(name="payment_id")
	private int payment_id;
	@Column(name="status")
	private int status;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStageId() {
		return stage_id;
	}
	public void setStageId(int stage_id) {
		this.stage_id = stage_id;
	}
	public String getXmlPayLoad() {
		return xml_payload;
	}
	public void setXmlPayLoad(String xml_payload) {
		this.xml_payload = xml_payload;
	}
	public int getPaymentId() {
		return payment_id;
	}
	public void setPaymentId(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
} 
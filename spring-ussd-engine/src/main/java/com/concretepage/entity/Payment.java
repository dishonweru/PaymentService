package com.concretepage.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payments_master")
public class Payment implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private int id;  
	@Column(name="ussd_code")
    private String ussd_code;
	@Column(name="inst_name")	
	private String inst_name;
	@Column(name="inst_type")
	private String inst_type;
	@Column(name="is_ussd")
	private int is_ussd;
	@Column(name="status")
	private int status;
	@Column(name="max_pin_tries")
	private int max_pin_tries;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getUssdCode() {
		return ussd_code;
	}
	public void setUssdCode(String ussd_code) {
		this.ussd_code = ussd_code;
	}
	public String getInstName() {
		return inst_name;
	}
	public void setInstName(String inst_name) {
		this.inst_name = inst_name;
	}
	public String getInstType() {
		return inst_type;
	}
	public void setInstType(String inst_type) {
		this.inst_type = inst_type;
	}
	public int getIsUssd() {
		return is_ussd;
	}
	public void setIsUssd(int is_ussd) {
		this.is_ussd = is_ussd;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getMaxPinTries() {
		return max_pin_tries;
	}
	public void setMaxPinTries(int max_pin_tries) {
		this.max_pin_tries = max_pin_tries;
	}
} 
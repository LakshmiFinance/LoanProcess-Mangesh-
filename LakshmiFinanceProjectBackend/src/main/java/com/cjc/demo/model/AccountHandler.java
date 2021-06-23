package com.cjc.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AccountHandler 
{

	@Id
	private int acid;
	
	private String acName;
	
	private String username;
	
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="oeId")
	private OperationalExecutive operationalExecutive;

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public OperationalExecutive getOperationalExecutive() {
		return operationalExecutive;
	}

	public void setOperationalExecutive(OperationalExecutive operationalExecutive) {
		this.operationalExecutive = operationalExecutive;
	}
}

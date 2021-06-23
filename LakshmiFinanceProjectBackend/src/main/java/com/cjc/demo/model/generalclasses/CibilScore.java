package com.cjc.demo.model.generalclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cjc.demo.model.CustomerPersonalDetails;

@Entity
public class CibilScore 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cibilscoreId;
	
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	private String cibilStatus;
	
	private int cibilScore;
	
	private String cibilRemark;
	


	


	public int getCibilscoreId() {
		return cibilscoreId;
	}

	public void setCibilscoreId(int cibilscoreId) {
		this.cibilscoreId = cibilscoreId;
	}

	public String getCibilStatus() {
		return cibilStatus;
	}

	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getCibilRemark() {
		return cibilRemark;
	}

	public void setCibilRemark(String cibilRemark) {
		this.cibilRemark = cibilRemark;
	}



}

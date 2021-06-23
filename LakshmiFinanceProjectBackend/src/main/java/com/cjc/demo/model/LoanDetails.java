package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDetails 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private  double loanAmount;
	private  Boolean loanStatus;
	private  String loanType;
	private  int tenure;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Boolean getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(Boolean loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}



}

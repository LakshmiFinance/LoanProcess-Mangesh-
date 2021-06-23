package com.cjc.demo.model.generalclasses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApproval 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	
	private String loanType;
	
	private double sanctionAmount;
	
	private String loanapporvalDate;
	
	private  double interestRate;
	
	private String loanStatus;

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getSanctionAmount() {
		return sanctionAmount;
	}

	public void setSanctionAmount(double sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}



	public String getLoanapporvalDate() {
		return loanapporvalDate;
	}

	public void setLoanapporvalDate(String loanapporvalDate) {
		this.loanapporvalDate = loanapporvalDate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}

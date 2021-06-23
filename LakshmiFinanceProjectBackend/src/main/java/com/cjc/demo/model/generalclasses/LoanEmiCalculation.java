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
public class LoanEmiCalculation
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int LoanemiId;
	
	
	private int customerId;
	
	
	private double annualinterestRate;



	private int numberofYear;

	private double loanAmount;

	private double monthlypayment;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	
	
	

	

public int getLoanemiId() {
		return LoanemiId;
	}

	public void setLoanemiId(int loanemiId) {
		LoanemiId = loanemiId;
	}

	public double getAnnualinterestRate() {
		return annualinterestRate;
	}

	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
	}


	public int getNumberofYear() {
		return numberofYear;
	}

	public void setNumberofYear(int numberofYear) {
		this.numberofYear = numberofYear;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getMonthlypayment() {
		return monthlypayment;
	}

	public void setMonthlypayment(double monthlypayment) {
		this.monthlypayment = monthlypayment;
	}







	
}

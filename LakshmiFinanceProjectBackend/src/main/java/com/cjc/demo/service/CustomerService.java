package com.cjc.demo.service;

import java.util.List;

import com.cjc.demo.model.CustomerPersonalDetails;
import com.cjc.demo.model.generalclasses.CibilScore;
import com.cjc.demo.model.generalclasses.LoanApproval;
import com.cjc.demo.model.generalclasses.LoanEmiCalculation;

public interface CustomerService
{

	public void saveData(CustomerPersonalDetails pd);
	
	public List<CustomerPersonalDetails> getData();
	
	public void emiData(LoanEmiCalculation lec);
	
	public List<LoanEmiCalculation> getloan();
	
	public void savecibil(CibilScore cs);
	
	public List<CibilScore> getcibil();
	

	
	
	public void saveLoan(LoanApproval la);
	
	public List<LoanApproval> getLoan();
}

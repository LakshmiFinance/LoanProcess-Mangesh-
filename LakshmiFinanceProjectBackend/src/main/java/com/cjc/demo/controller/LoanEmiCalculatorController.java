package com.cjc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.model.generalclasses.LoanEmiCalculation;
import com.cjc.demo.service.CustomerService;


@RestController
@CrossOrigin("*")
public class LoanEmiCalculatorController 
{
	@Autowired
	CustomerService cs;

	@PostMapping("/emi")
	public void emiData(@RequestBody LoanEmiCalculation lec)
	{
		
		double interestrate=lec.getAnnualinterestRate();
		
		double monthlyinterest=interestrate/1200;
		
		int noofyear=lec.getNumberofYear();
		
		double loanamt=lec.getLoanAmount();
		
		double monthlypayment=loanamt*monthlyinterest/(1-1/Math.pow(1+monthlyinterest, noofyear*12));
		lec.setMonthlypayment(monthlypayment);
		
		cs.emiData(lec);
		
		
	
	}
	
	@GetMapping("/getemi")
	public List<LoanEmiCalculation> getloan()
	{
		return cs.getloan();
		
	}
	
}

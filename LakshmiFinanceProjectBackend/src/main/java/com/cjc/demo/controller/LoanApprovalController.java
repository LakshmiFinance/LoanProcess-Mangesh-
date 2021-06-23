package com.cjc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.model.CustomerPersonalDetails;
import com.cjc.demo.model.generalclasses.LoanApproval;
import com.cjc.demo.service.CustomerService;

@RestController
@CrossOrigin("*")
public class LoanApprovalController 

{
	@Autowired
	CustomerService cs;
	
	@PostMapping(value = "/saveloan")
	public void saveLoan(@RequestBody LoanApproval la)
	{
		cs.saveLoan(la);
		
	}
	
	@GetMapping(value = "/getloan")
	public List<LoanApproval> getLoan()
	{
		return cs.getLoan();
	}
	

}

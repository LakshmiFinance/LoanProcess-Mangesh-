package com.cjc.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.model.CustomerPersonalDetails;
import com.cjc.demo.model.generalclasses.CibilScore;
import com.cjc.demo.model.generalclasses.LoanApproval;
import com.cjc.demo.model.generalclasses.LoanEmiCalculation;
import com.cjc.demo.repository.CibilRepository;
import com.cjc.demo.repository.CustomerRepository;
import com.cjc.demo.repository.LoanApprovalRepository;
import com.cjc.demo.repository.LoanEmiRepository;
import com.cjc.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	CustomerRepository cr;
	@Autowired
	LoanEmiRepository ler;
	
	@Autowired
	CibilRepository cbr;
	
	@Autowired
	LoanApprovalRepository lr;
	
	public void saveData(CustomerPersonalDetails pd)
	{
	cr.save(pd);
		
	}

	
	public List<CustomerPersonalDetails> getData() {
	
		return (List<CustomerPersonalDetails>) cr.findAll();
	}



	
	public void emiData(LoanEmiCalculation lec) 
	{
	ler.save(lec);
		
	}


	@Override
	public void savecibil(CibilScore cs) {
		cbr.save(cs);
		
	}


	@Override
	public List<CibilScore> getcibil() {
	
		return (List<CibilScore>) cbr.findAll();
	}


	@Override
	public List<LoanEmiCalculation> getloan() {
		
		return (List<LoanEmiCalculation>) ler.findAll();
	}


	@Override
	public void saveLoan(LoanApproval la) {
       lr.save(la);
		
	}


	@Override
	public List<LoanApproval> getLoan() 
	{
	
		return (List<LoanApproval>) lr.findAll();
	}

}

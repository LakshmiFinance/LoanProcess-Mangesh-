package com.cjc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.model.CustomerPersonalDetails;
import com.cjc.demo.model.generalclasses.CibilScore;
import com.cjc.demo.service.CustomerService;

@RestController
@CrossOrigin("*")
public class CibilScoreController 
{
	@Autowired
	CustomerService cs;
	
	@PostMapping("/cibil")
	public void saveCibil(@RequestBody CibilScore cb)
	{
		
		
		int cibilscore1=670;
		
		if(cibilscore1<=cb.getCibilScore())
		{
		
			String status="approved";
			 String remark="Good cibile score";
			cb.setCibilStatus(status);
			cb.setCibilRemark(remark);
		
			cs.savecibil(cb);
		}
		else
		{
			String status="Not approved";
			 String remark="improve cibile score";
			 
			 cb.setCibilStatus(status);
			 cb.setCibilRemark(remark);
			cs.savecibil(cb);
			
		}
	}
	
	@GetMapping("/getcibil")
	public List<CibilScore> getCibil()
	{
		return cs.getcibil();
		
	}

}

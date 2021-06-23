package com.cjc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.model.CustomerPersonalDetails;
import com.cjc.demo.service.CustomerService;

@CrossOrigin("*")
@RestController
public class CustomerController 
{
	@Autowired
CustomerService cs;
	
	@PostMapping(value = "/save")
	public void saveData(@RequestBody CustomerPersonalDetails pd)
	{
		cs.saveData(pd);
		
	}
	
	@GetMapping(value = "/getData")
	public List<CustomerPersonalDetails> getData()
	{
		return cs.getData();
	}
	
	

}

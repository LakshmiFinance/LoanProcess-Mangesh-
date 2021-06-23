package com.cjc.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CreditManager 
{
	@Id
	private int cmId;
	
	private String cmName;
	
	private String username;
	
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="oeId")
	private OperationalExecutive operationalExecutive;
	
	
	

}

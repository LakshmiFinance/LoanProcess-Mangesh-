package com.cjc.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class RelationalExcutive 
{
	@Id
	private int reId;
	
	private String rName;
	
	private String username;
	
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cId")
	private CustomerPersonalDetails customerPersonalDetails;
	
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="oeId")
	private Set<OperationalExecutive> operationalExecutive=new HashSet<OperationalExecutive>();


	public int getReId() {
		return reId;
	}


	public void setReId(int reId) {
		this.reId = reId;
	}


	public String getrName() {
		return rName;
	}


	public void setrName(String rName) {
		this.rName = rName;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public CustomerPersonalDetails getCustomerPersonalDetails() {
		return customerPersonalDetails;
	}


	public void setCustomerPersonalDetails(CustomerPersonalDetails customerPersonalDetails) {
		this.customerPersonalDetails = customerPersonalDetails;
	}


	public Set<OperationalExecutive> getOperationalExecutive() {
		return operationalExecutive;
	}


	public void setOperationalExecutive(Set<OperationalExecutive> operationalExecutive) {
		this.operationalExecutive = operationalExecutive;
	}
	
		
	
	

}

package com.cjc.demo.model.generalclasses;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cjc.demo.model.CustomerPersonalDetails;
import com.cjc.demo.model.OperationalExecutive;

@Entity
public class ViewEnquiry 
{
	@Id
private int enquiryId;
	
	@OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name="oeId")
	private OperationalExecutive operationalExecutive;
	
	@OneToOne
	 @JoinColumn(name="customerId")
	private CustomerPersonalDetails CustomerPersonalDetails;

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public OperationalExecutive getOperationalExecutive() {
		return operationalExecutive;
	}

	public void setOperationalExecutive(OperationalExecutive operationalExecutive) {
		this.operationalExecutive = operationalExecutive;
	}
	
}

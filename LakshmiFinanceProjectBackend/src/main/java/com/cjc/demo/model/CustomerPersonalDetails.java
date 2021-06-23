package com.cjc.demo.model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.cjc.demo.model.generalclasses.CibilScore;
@Entity
public class CustomerPersonalDetails 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int customerId;
		private String customerName;
		private String customerGender;
		private long customerMobileNo;
		private int customerAge;
		private String customerDob;
		private String customerEmail;
		private String customerPanCardNo;
		
		
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name = "customer_Id")
		private Set<BankDetails> bankDetails=new HashSet<BankDetails>();
		
		@OneToMany(cascade = CascadeType.ALL)
		
		@JoinColumn(name = "customer_Id")
		private Set<CustomerAddressDetails> customerAddressDetails=new HashSet<CustomerAddressDetails>();
		
		/*
		 * @OneToMany(cascade = CascadeType.ALL)
		 * 
		 * @JoinColumn(name = "customer_Id") private Set<LoanDetails> loanDetails =new
		 * HashSet<LoanDetails>();
		 * 
		 * @OneToMany(cascade = CascadeType.ALL)
		 * 
		 * @JoinColumn(name = "vehical_Id") private Set<VehicalDetails>
		 * VehicalDetails=new HashSet<VehicalDetails>() ;
		 */

		
		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerGender() {
			return customerGender;
		}

		public void setCustomerGender(String customerGender) {
			this.customerGender = customerGender;
		}

		public long getCustomerMobileNo() {
			return customerMobileNo;
		}

		public void setCustomerMobileNo(long customerMobileNo) {
			this.customerMobileNo = customerMobileNo;
		}

		public int getCustomerAge() {
			return customerAge;
		}

		public void setCustomerAge(int customerAge) {
			this.customerAge = customerAge;
		}

		public String getCustomerDob() {
			return customerDob;
		}

		public void setCustomerDob(String customerDob) {
			this.customerDob = customerDob;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		public String getCustomerPanCardNo() {
			return customerPanCardNo;
		}

		public void setCustomerPanCardNo(String customerPanCardNo) {
			this.customerPanCardNo = customerPanCardNo;
		}

		public Set<BankDetails> getBankDetails() {
			return bankDetails;
		}

		public void setBankDetails(Set<BankDetails> bankDetails) {
			this.bankDetails = bankDetails;
		}

		public Set<CustomerAddressDetails> getCustomerAddressDetails() {
			return customerAddressDetails;
		}

		public void setCustomerAddressDetails(Set<CustomerAddressDetails> customerAddressDetails) {
			this.customerAddressDetails = customerAddressDetails;
		}
		/*
		 * public Set<LoanDetails> getLoanDetails() { return loanDetails; }
		 */

		/*
		 * public void setLoanDetails(Set<LoanDetails> loanDetails) { this.loanDetails =
		 * loanDetails; }
		 * 
		 * public Set<VehicalDetails> getVehicalDetails() { return VehicalDetails; }
		 * 
		 * public void setVehicalDetails(Set<VehicalDetails> vehicalDetails) {
		 * VehicalDetails = vehicalDetails; }
		 */
		
		

		
		
}

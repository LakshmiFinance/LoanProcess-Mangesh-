package com.cjc.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CustomerAddressDetails
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int customerAddressId;
	 private int houseNo;
		private String area;
	     private String city;
		 private String state;
		 private String country;
		public int getCustomerAddressId() {
			return customerAddressId;
		}
		public void setCustomerAddressId(int customerAddressId) {
			this.customerAddressId = customerAddressId;
		}
		public int getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(int houseNo) {
			this.houseNo = houseNo;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		 
		
		 
		 
	
	

	
}

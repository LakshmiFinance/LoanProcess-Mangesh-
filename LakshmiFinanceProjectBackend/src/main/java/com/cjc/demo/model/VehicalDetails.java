package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicalDetails 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleId;
	private String modelNo;
    private String vehicleName;
	private String vehicleType;
	private String dealer;
	private double price;
	private double onRoadPrice;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}


	
}

package com.cjc.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankDetails
{
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int bankId;
	 private  String bankName;        
	 private  long accountNo;
	 private  String bankIfsc;
	 private  String bankMicr;
	 private  String bankAddress;   
	 private String branchName;           

	 public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankIfsc() {
		return bankIfsc;
	}
	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}
	public String getBankMicr() {
		return bankMicr;
	}
	public void setBankMicr(String bankMicr) {
		this.bankMicr = bankMicr;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


}

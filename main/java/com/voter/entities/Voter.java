package com.voter.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

 
@Entity
public class Voter{
	
	@Id    
    private int voterId;
    private String voterName;
    private String status;
    private String district;
    private int mobile;
    private String DOB;
    private String gender;
    private String address;
    private String password;
            
    public  Voter() {
    }
 
    public Voter(int voterId,  String voterName, String status,String district, int mobile, String DOB, String gender, String address, String password) {
    	super();
    	this.voterId = voterId;
        this.voterName = voterName;
        this.status = status;
        this.district = district;
        this.mobile = mobile;
        this.DOB = DOB;
        this.gender = gender;
        this.address = address;
        this.password = password; 
    }  		

	public int getvoterId() {
		return voterId;
	}

	public void setvoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getvoterName() {
		return voterName;
	}

	public void setvoterName(String voterName) {
		this.voterName = voterName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", voterName=" + voterName + ", status=" + status + ", district=" + district + ", mobile="
				+ mobile + ", DOB=" + DOB + ", gender=" + gender + ", address=" + address + ", password=" + password
				+ "]";
	}

	
	}

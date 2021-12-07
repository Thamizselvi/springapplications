package com.sw.OneToMany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "useradd")

public class UserAddress {

	@Id
	@GeneratedValue

	@Column(name = "AddressID")
	private Integer AddressID;

	@Column(name = "street")
	private String street;

	@Column(name = "pincode")
	private Integer pincode;

	@Column(name = "state")
	private String state;
	
	@Column(name = "userid")
	private Integer userid;

	
	   

	public UserAddress() {
		super();
	}
	
	public UserAddress(Integer AddressID, String street, Integer pincode, String state,Integer userid) {
		super();
		this.AddressID = AddressID;
		this.street = street;
		this.pincode = pincode;
		this.state = state;
		this.userid = userid;
	}
	
	public Integer getAdd_id() {
		return AddressID;
	}

	public void setAdd_id(Integer AddressID) {
		this.AddressID = AddressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getpinCode() {
		return pincode;
	}

	public void setpinCode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public Integer getId() {
		return userid;
	}

	public void setId(Integer userid) {
		this.userid = userid;
	}
	
	@Override
	public String toString() {
		return "UserAddress [AddressID=" + AddressID + ", id=" + userid + ", street=" + street + ", state="
				+ state + "]";
	}
}

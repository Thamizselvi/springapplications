package com.scrunch.ManytoOne.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.scrunch.ManytoOne.model.User;

@Entity
@Table(name = "UserProfile")
public class UserProfile {
	@Id

	@Column(name = "profileid")
	private Integer profileid;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;


	@Column(name = "phone")
	private Integer phone;

	@Column(name = "userid")
	private Integer userid;
	
	@ManyToOne
	private User user;
	
	public UserProfile() {
		super();
	}

	public UserProfile(Integer profileid, String address, String city, Integer phone, Integer userid, User user) {
		super();
		this.profileid = profileid;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.userid = userid;
		
	}

	public Integer getProfileid() {
		return profileid;
	}

	public void setProfileid(Integer profileid) {
		this.profileid = profileid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getphone() {
		return phone;
	}

	public void setphone(Integer phone) {
		this.phone = phone;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "UserProfile [profileid=" + profileid + ", address=" + address + ", city=" + city + ", phone=" + phone
				+ ", userid=" + userid + ", ]";
	}

}
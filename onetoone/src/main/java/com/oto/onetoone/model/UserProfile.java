package com.oto.onetoone.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.oto.onetoone.model.User;

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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid", nullable = false, updatable = false, insertable = false)

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
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserProfile [profileid=" + profileid + ", address=" + address + ", city=" + city + ", phone=" + phone
				+ ", userid=" + userid + ", user=" + user + "]";
	}

}

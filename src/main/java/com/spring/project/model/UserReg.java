package com.spring.project.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="userReg")

public class UserReg {
	
	public UserReg() {
		
	}
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long urUsid;
	private String urLoginid;
	private String urPassword;
	private String urUsername;
	private String urMobileNo;
	
	/*
	 * public UserReg(long urUsid, String urLoginid,String urPassword,String
	 * urUsername,String urMobileNo) { this.urUsid = urUsid; this.urLoginid =
	 * urLoginid; this.urPassword = urPassword; this.urUsername = urUsername;
	 * this.urMobileNo = urMobileNo;
	 * 
	 * 
	 * }
	 */
	
	public long getUrUsid() {
		return urUsid;
	}
	public void setUrUsid(long urUsid) {
		this.urUsid = urUsid;
	}
	@Column(name = "ur_loginid", nullable = false)
	public String getUrLoginid() {
		return urLoginid;
	}
	public void setUrLoginid(String urLoginid) {
		this.urLoginid = urLoginid;
	}
	@Column(name = "ur_password", nullable = false)
	public String getUrPassword() {
		return urPassword;
	}
	public void setUrPassword(String urPassword) {
		this.urPassword = urPassword;
	}
	@Column(name = "ur_username", nullable = false)
	public String getUrUsername() {
		return urUsername;
	}
	public void setUrUsername(String urUsername) {
		this.urUsername = urUsername;
	}
	
	@Column(name = "ur_mobile_no", nullable = false)
	public String getUrMobileNo() {
		return urMobileNo;
	}
	public void setUrMobileNo(String urMobileNo) {
		this.urMobileNo = urMobileNo;
	}

	public UserReg(long urUsid, String urLoginid, String urPassword, String urUsername, String urMobileNo) {
		super();
		this.urUsid = urUsid;
		this.urLoginid = urLoginid;
		this.urPassword = urPassword;
		this.urUsername = urUsername;
		this.urMobileNo = urMobileNo;
	}
}

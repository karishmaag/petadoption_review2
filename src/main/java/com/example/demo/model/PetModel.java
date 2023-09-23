package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import java.lang.constant.*; 

@Entity
@Table(name="petadoption")
public class PetModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
	private String petname;	
	private String color;
	private String uname;
	private String uemail;
	private String upassword;
	private long uphone; 
	private String uaddress;
	
//	public PetModel() {
//		// TODO Auto-generated constructor stub
//	}
	
	public PetModel(Long pid, String petname, String color, String uname, String uemail, String upassword, long uphone,
			String uaddress) {
		super();
		this.pid = pid;
		this.petname = petname;
		this.color = color;
		this.uname = uname;
		this.uemail = uemail;
		this.upassword = upassword;
		this.uphone = uphone;
		this.uaddress = uaddress;
	}
	public PetModel() {
		// TODO Auto-generated constructor stub
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public long getUphone() {
		return uphone;
	}
	public void setUphone(long uphone) {
		this.uphone = uphone;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	
}

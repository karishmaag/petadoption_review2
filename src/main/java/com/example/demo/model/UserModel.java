package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="usertable")
public class UserModel {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	private long aadhar;
	private String email;
	private String password;
	private long phone;
	private String address;
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	public UserModel(Long id, String name, int age, long aadhar, String email, String password, long phone,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
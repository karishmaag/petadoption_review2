package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo sr;
	public UserModel savedetail(UserModel ss)
	{
		return sr.save(ss);
	}
	public List<UserModel> showinfos()
	{
		return sr.findAll();
	}
}

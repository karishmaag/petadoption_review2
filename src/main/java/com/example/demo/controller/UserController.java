package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService sser;
	@PostMapping("/addnuser")
    public UserModel addndetail(@RequestBody UserModel ss)
    {
   	 return sser.savedetail(ss);
    }
    @GetMapping("showuser")
    public List<UserModel >show()
    {
 	   return sser.showinfos();
    }
}

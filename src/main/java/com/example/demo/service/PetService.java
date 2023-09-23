package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.PetModel;
import com.example.demo.repository.PetRepo;


@Service
public class PetService {
	@Autowired
	PetRepo ssr;
	
	public List<PetModel>savedetails(List<PetModel> ss)
	{
		return (List<PetModel>)ssr.saveAll(ss);
	}
	public List<PetModel> showinfo()
	{
		return ssr.findAll();
	}
	public PetModel changeinfo(PetModel ss)
    {
   	 return ssr.saveAndFlush(ss);
    }
	 public void deleteinfo(PetModel ss)
	    {
	   	  ssr.delete(ss);
	    }

}

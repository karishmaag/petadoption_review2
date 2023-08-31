package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.PetModel;
import com.example.demo.repository.PetRepo;



@Service
public class PetService {
	@Autowired
	PetRepo sr;
	
	public List<PetModel>savedetails(List<PetModel> ss)
	{
		return (List<PetModel>)sr.saveAll(ss);
	}
	public List<PetModel> showinfo()
	{
		return sr.findAll();
	}
	public PetModel changeinfo(PetModel ss)
    {
   	 return sr.saveAndFlush(ss);
    }
	 public void deleteinfo(PetModel ss)
	    {
	   	  sr.delete(ss);
	    }
	public Optional<PetModel> showinfId(int id)
	{
		sr.findById(id);
		if(!sr.existsById(id))
		{
			System.out.print("null");
		}
			return sr.findById(id);
		
	}
	public String changeinfoid(int id,PetModel ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
	public List<PetModel>sortinfo(String s)
	 {
		 return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	 }
	 public  List<PetModel>getbyPage(int pgno,int pgSize)
	 {
		 Page<PetModel>p=sr.findAll(PageRequest.of(pgno, pgSize));
		 return p.getContent();
	 }
	 public List<PetModel>getDetails(int i,String b)
	 {
		 return sr.getPetInfo(i,b);
	 }
	 public List<PetModel>getDetails1(int i,String b)
	 {
		 return sr.getPetInfo1(i, b);
	 }
	 public List<PetModel>getDetails2(String b)
	 {
		 return sr.getPetInfo2(b);
	 }
	 public Integer getDetails3(String b,int i)
	 {
		 return sr.getPetInfo3(b,i);
	 }
}

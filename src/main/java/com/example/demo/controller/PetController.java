package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PetModel;
import com.example.demo.service.PetService;

@RestController
public class PetController {

	@Autowired
    PetService sser;
    @PostMapping("addnpet")
    public List<PetModel> addndetails(@RequestBody List<PetModel> ss)
    {
   	 return sser.savedetails(ss);
    }
    @GetMapping("show")
    public List<PetModel >show()
    {
 	   return sser.showinfo();
    }
    @PutMapping("update")
    public PetModel modify(@RequestBody PetModel ss)
    {
   	 return sser.changeinfo(ss);
    }
    @DeleteMapping("delete")
    public  String del(@RequestBody PetModel ss)
    {
   	  sser.deleteinfo(ss);
   	  return "deleted successfully";
    }
    @GetMapping("get/{id}")
    public Optional<PetModel>getinfo(@PathVariable int id)
    {
 	   return sser.showinfId(id);
    }
    @PutMapping("update/{id}")
    public String modifybyid(@PathVariable int id,@RequestBody PetModel ss)
	{
		return sser.changeinfoid(id,ss);
	}
    @DeleteMapping("delete/{id}")
    public  void deletemyid(@PathVariable int id)
    {
   	  sser.deleteid(id);
    }
    @GetMapping("sort/{name}")
	public List<PetModel>getsortinfo(@PathVariable String name)
	{
		return sser.sortinfo(name);
    }
    @GetMapping("paging/{pageno}/{pagesize}")
    public List<PetModel> showPage(@PathVariable int pageno,@PathVariable int pagesize)
    {
	 return sser.getbyPage(pageno, pagesize);
    }
    @GetMapping("getnew/{id}/{name}")
    public List<PetModel>displayAll(@PathVariable int id,@PathVariable String name)
    {
   	 return sser.getDetails(id, name);
    }
    @GetMapping("getnew1/{id}/{name}")
    public List<PetModel>displayAll1(@PathVariable int id,@PathVariable  String name)
    {
   	 return sser.getDetails1(id, name);
    }
    @GetMapping("getnew2/{name}")
    public List<PetModel>displayAll2(@PathVariable  String name)
    {
   	 return sser.getDetails2(name);
    }
    @GetMapping("getnew3/{name}/{id}")
    public String displayAll3(@PathVariable  String name,@PathVariable int id)
    {
   	 sser.getDetails3(name,id);
   	 return " updated";
    }
    
}

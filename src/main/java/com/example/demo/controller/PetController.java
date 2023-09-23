package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PetModel;
import com.example.demo.service.PetService;

@RestController
@CrossOrigin
@RequestMapping("/api1")
public class PetController {

	@Autowired
    PetService ser;
    @PostMapping("/addnpet")
    public List<PetModel> addndetails(@RequestBody List<PetModel> ss)
    {
   	 return ser.savedetails(ss);
    }
    @GetMapping("show")
    public List<PetModel >show()
    {
 	   return ser.showinfo();
    }
    @PutMapping("update")
    public PetModel modify(@RequestBody PetModel ss)
    {
   	 return ser.changeinfo(ss);
    }
    @DeleteMapping("delete")
    public  String del(@RequestBody PetModel ss)
    {
   	  ser.deleteinfo(ss);
   	  return "deleted successfully";
    }
    
}

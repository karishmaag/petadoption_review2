package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.PetModel;

import jakarta.transaction.Transactional;
 
public interface PetRepo extends JpaRepository<PetModel,Integer> {

	@Query(value="select * from petadoption where id=:s or animalname=:sn",nativeQuery = true)
	public List<PetModel>getPetInfo(@Param("s") int id,@Param("sn") String animalname);
	
	@Query(value="select *from petadoption where id=:s and animalname=:sn",nativeQuery = true)
	public List<PetModel>getPetInfo1(@Param("s") int id,@Param("sn") String animalname);
	
	@Query(value="select * from petadoption where animalname like :sn%",nativeQuery = true)
	public List<PetModel>getPetInfo2(@Param("sn") String sn);
	
	@Modifying
	@Transactional
	@Query(value="update petadoption set animalspecies=:s where id=:sn ",nativeQuery = true)
	public Integer getPetInfo3(@Param("s") String s,@Param("sn") int id);
	
}

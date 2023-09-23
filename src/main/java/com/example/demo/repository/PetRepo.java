package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.*;
import com.example.demo.model.PetModel;

public interface PetRepo extends JpaRepository<PetModel, Long>{

}

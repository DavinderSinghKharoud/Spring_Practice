package com.example.demo.Dao;

import com.example.demo.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien,Integer> {
}

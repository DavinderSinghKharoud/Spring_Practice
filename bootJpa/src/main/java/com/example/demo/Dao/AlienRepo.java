package com.example.demo.Dao;

import com.example.demo.model.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien,Integer> {

    List<Alien> findByTech(String tech);

    List<Alien> findByaIDGreaterThan(int value);

    @Query("from Alien where tech=?1 order by aID")
    List<Alien> findByaIDSorted(String tech);
}

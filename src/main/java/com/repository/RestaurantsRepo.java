package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Restaurants;

@Repository
public interface RestaurantsRepo extends JpaRepository<Restaurants, Integer>{

}

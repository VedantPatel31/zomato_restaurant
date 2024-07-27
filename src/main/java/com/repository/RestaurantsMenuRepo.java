package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.RestaurantsMenu;

@Repository
public interface RestaurantsMenuRepo extends JpaRepository<RestaurantsMenu, Integer>{

}

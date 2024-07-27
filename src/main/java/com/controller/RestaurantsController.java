package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Restaurants;
import com.repository.RestaurantsRepo;

@RestController 
public class RestaurantsController {
	@Autowired 
	RestaurantsRepo repo;
	
	@PostMapping("/restautant")
	public Restaurants restaurants(@RequestBody Restaurants restaurants) {
		repo.save(restaurants);
		return restaurants;
	}
	
	@GetMapping("/Allrestautant")
	public List<Restaurants> getAllRestaurants() {
		List<Restaurants> restaurants =  repo.findAll();
		return restaurants;
	}
	
	@DeleteMapping("/deleteRestautant/{rId}")
	public Restaurants deleteRestaurants(@PathVariable("rId") Integer rId) {
		Restaurants deletedUser = repo.findById(rId).get();
		repo.deleteById(rId);
		return deletedUser;
	}
	
	@PutMapping("/restautant/update")
	public Restaurants updateRestaurants(@RequestBody Restaurants restaurants){
		repo.save(restaurants);
		return restaurants;
	}
	
}

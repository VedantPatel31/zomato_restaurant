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

import com.entity.RestaurantsMenuItems;
import com.repository.RestaurantsMenuItemRepo;

@RestController 
public class RestaurantsMenuItemController {
	@Autowired 
	RestaurantsMenuItemRepo itemRepo;
	
	@PostMapping("/menuItem")
	public RestaurantsMenuItems items (@RequestBody RestaurantsMenuItems items) {
		itemRepo.save(items);
		return items;
	}
	
	@GetMapping("/menuItem/get")
	public List<RestaurantsMenuItems> getItems () {
		List<RestaurantsMenuItems> items = itemRepo.findAll();
		return items;
	}
	
	@DeleteMapping("/deleteMenuItem/{mId}")
	public RestaurantsMenuItems deleteItems (@PathVariable("mId") Integer mId) {
		RestaurantsMenuItems item = itemRepo.findById(mId).get();
		itemRepo.deleteById(mId);
		return item;
	}
	
	
	@PutMapping("/menuItem/update")
	public RestaurantsMenuItems updateItems (@RequestBody RestaurantsMenuItems items) {
		itemRepo.save(items);
		return items;
	}
}

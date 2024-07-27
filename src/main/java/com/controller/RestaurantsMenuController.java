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

import com.entity.RestaurantsMenu;
import com.repository.RestaurantsMenuRepo;

@RestController 
public class RestaurantsMenuController {
	@Autowired
	RestaurantsMenuRepo repo;
	
	@PostMapping("/menu")
	public RestaurantsMenu restaurantsMenu (@RequestBody RestaurantsMenu menu) {
		repo.save(menu);
		return menu;
	}
	@GetMapping("/menu")
	public List<RestaurantsMenu> getAllMenu () {
		List<RestaurantsMenu> menu= repo.findAll();
		return menu;
	}
	
	@DeleteMapping("/menu/{menuId}")
	public RestaurantsMenu deleteMenu (@PathVariable("menuId") Integer menuId) {
		RestaurantsMenu menu = repo.findById(menuId).get();
		repo.deleteById(menuId);
		return menu;
	}
	
	@PutMapping("/menu/update")
	public RestaurantsMenu updateMenu (@RequestBody RestaurantsMenu menu) {
		repo.save(menu);
		return menu;
	}
}

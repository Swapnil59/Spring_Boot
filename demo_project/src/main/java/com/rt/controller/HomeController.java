package com.rt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.HomeEntity;
import com.rt.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService service;

	@PostMapping("/add")
	public String addEmp(@RequestBody HomeEntity e) {

		service.addData(e);

		return "Added";
	}

	@DeleteMapping("/delete/id/{id}")
	public HomeEntity deleteById(@PathVariable int id) {
		HomeEntity e = service.deleteById(id);
		return e;
	}

	@GetMapping("/find/id/{id}")
	public Optional<HomeEntity> findById(@PathVariable int id) {
		Optional<HomeEntity> e = service.findById(id);
		return e;
	}

	@GetMapping("/find/name/{name}")
	public List<HomeEntity> findByName(@PathVariable String name) {
		List<HomeEntity> e = service.findByName(name);
		return e;

	}

	@GetMapping("/findAll")
	public List<HomeEntity> findAll() {
		List<HomeEntity> e = service.findAll();
		return e;
	}

}

package com.example.magazine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.magazine.entity.Scaffale;
import com.example.magazine.repository.ScaffaleRepository;

@RestController
public class ScaffaleController {
	
@Autowired
ScaffaleRepository scaffaleRepository;

@GetMapping("/scaffales")
public Iterable<Scaffale>getAllScaffales(){
	return scaffaleRepository.findAll();
	
}
	
}

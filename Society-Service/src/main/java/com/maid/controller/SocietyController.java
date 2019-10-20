package com.maid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maid.properties.SocietyProperties;

@RestController
public class SocietyController {

	@Autowired
	private SocietyProperties societyProperties;

	@GetMapping("/societies")
	public String getSocieties() {
		return societyProperties.getSocieties();
	}
	
}

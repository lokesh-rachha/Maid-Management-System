package com.maid.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maid.properties.SocietyProperties;

@RestController
public class SocietyController {

	private final SocietyProperties societyProperties;

	public SocietyController(SocietyProperties societyProperties) {
		this.societyProperties = societyProperties;
	}

	@GetMapping("/societies")
	public String getSocieties() {
		return societyProperties.getSocieties();
	}

}

package com.maid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maid.controller.client.SocietyClient;

@RestController
public class MaidController {

	@Autowired
	private SocietyClient societyClient;
	
	@GetMapping("/allsocieties")
	public String allRegisteredSocieties() {
		return societyClient.getSocieties();
	}
}

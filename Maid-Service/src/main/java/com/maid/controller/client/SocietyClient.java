package com.maid.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "society-service", path = "/society")
public interface SocietyClient {

	@GetMapping("/societies")
	public String getSocieties();
}

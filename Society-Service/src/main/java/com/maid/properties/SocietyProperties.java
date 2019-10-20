package com.maid.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SocietyProperties {

	@Value("${society.societies}")
	private String societies;

	public String getSocieties() {
		return societies;
	}

	public void setSocieties(String societies) {
		this.societies = societies;
	}
}

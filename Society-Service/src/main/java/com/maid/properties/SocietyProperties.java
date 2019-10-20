package com.maid.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("society")
public class SocietyProperties {

	private String societies;

	public String getSocieties() {
		return societies;
	}

	public void setSocieties(String societies) {
		this.societies = societies;
	}
}

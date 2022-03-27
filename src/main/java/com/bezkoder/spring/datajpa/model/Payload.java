package com.bezkoder.spring.datajpa.model;



public class Payload {


	public String payload;
	public String url;


	public Payload() {

	}

	public Payload(String payload, String url) {
		this.payload = payload;
		this.url = url;
	}

	public String getPayload() {
		return payload;
	}
	public String getUrl() {
		return url;
	}
	@Override
	public String toString() {
		return "";
	}

}
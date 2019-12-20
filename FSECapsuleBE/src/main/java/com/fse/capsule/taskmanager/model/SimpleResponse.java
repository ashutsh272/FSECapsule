package com.fse.capsule.taskmanager.model;

public class SimpleResponse {
	private String message;
	
	public SimpleResponse() {
		super();
	}
	
	public SimpleResponse(String message) {
		super();
		this.message=message;
	}
		
	

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

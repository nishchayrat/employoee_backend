package com.nishchay.employee.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
	private int status;
	private LocalDateTime timestamp;
	private String message;
	
	public ErrorResponse(int status, LocalDateTime timestamp, String message) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}

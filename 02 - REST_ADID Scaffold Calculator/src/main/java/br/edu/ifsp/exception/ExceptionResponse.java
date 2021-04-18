package br.edu.ifsp.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String message;
	private String datails;
	
	public ExceptionResponse(Date timestamp, String message, String datails) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.datails = datails;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDatails() {
		return datails;
	}
}

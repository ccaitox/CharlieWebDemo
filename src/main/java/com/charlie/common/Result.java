package com.charlie.common;

public class Result <T>{
	private boolean result;
	private T datum;
	private String reason;
	
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	
	
	public T getDatum() {
		return datum;
	}
	public void setDatum(T datum) {
		this.datum = datum;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}

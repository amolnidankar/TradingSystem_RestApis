package com.trading_system.service.exception;

public class ResourseNotFoundException extends RuntimeException{

	String resource_name;
	String field_name;
	long field_Value;
	String s;
	
	public ResourseNotFoundException(String s ) {
		super(String.format("%s",s));
		
	}
	
	public ResourseNotFoundException(String resource_name,String field_name,long field_Value ) {
		super(String.format("%s not found with %s : %s",resource_name,field_name,field_Value));
		this.resource_name=resource_name;
		this.field_name=field_name;
		this.field_Value=field_Value;
	}

	public String getResource_name() {
		return resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public long getField_Value() {
		return field_Value;
	}

	public void setField_Value(long field_Value) {
		this.field_Value = field_Value;
	}
	
//	dafdfda
	
	
	
	
}

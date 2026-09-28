package com.restaurantapp.model;

public enum Cuisine {

	SI("SOUTH INDIAN"),
	NI("NORTH INDIAN"), 
	IT("ITALIAN"), 
	CH("CHINESE"), 
	CO("CONTINENTAL");

	private String cuisinetype;

	private Cuisine(String type) {
		this.cuisinetype = type;
	}

	public String getCuisinetype() {
		return cuisinetype;
	}

}

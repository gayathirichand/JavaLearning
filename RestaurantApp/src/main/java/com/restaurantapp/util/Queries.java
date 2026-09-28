package com.restaurantapp.util;

public class Queries {
	public static final String INSERTQUERY = """
			insert into restaurant
			(restaurant_name,city,cuisine ,restaurant_type,
			cost_for_two,opening_time,closing_time,ratings)
			values(?,?,?,?,?,?,?,?)
			""";
	public static final String UPDATEQUERY = "update restaurant set cost_for_two=? where restaurant_id=?";
	public static final String GETBYCITYQUERY = "select * from restaurant where city =?";
	public static final String GETALLQUERY = "select * from restaurant";
	public static final String CUISINEBYLESSERCOST = "select * from restaurant where cuisine =? and cost_for_two <? order by cost_for_two";
	public static final String DELETEBYID = "delete  from restaurant where restaurant_id=?";
	public static final String FINDBYID = "select * from restaurant where restaurant_id=?";
	public static final String FINDBYTYPELESSERCOST = "select * from restaurant where restaurant_type =? and cost_for_two <? order by cost_for_two";
	public static final String FINDBYTIME = "select * from restaurant where opening_time =? order by opening_time";
	public static final String FINDBYRATINGSANDTYPE = "select * from restaurant where restaurant_type =? and ratings=?";
	public static final String FINDBYCITY = "select * from restaurant where city =?";

}

package com.cg.util;

import java.util.HashMap;

import com.cg.beans.Hotel;
import com.cg.beans.TravelAgency;
import com.cg.beans.Users;

public class HotelUtil {
	private static int HOTEL_ID_COUNTER=0;
	
	private static int HOTEL_IDX=0;
	
	private static int TRAVEL_AGENCY_ID_COUNTER=0;

	public static HashMap<Integer, Hotel> hotels = new HashMap<Integer, Hotel>();
	
	public static HashMap<String, Users> users = new HashMap<String, Users>();
	
	public static HashMap<Integer, TravelAgency> agency = new HashMap<Integer, TravelAgency>();
	
	static {
		users.put("tanujkr",new Users("tanujkr", "123456789", "superadmin"));
		users.put("raonrd", new Users("raonrd", "rao123456", "admin"));
		agency.put(1, new TravelAgency(1, "Mumbai travellers", "maharashtra", "mumbai", "airoli", "9999888877", "abc@mum.com", "traveller.com"));
	}
	
	public static int getHOTEL_ID_COUNTER() {
		return ++HOTEL_ID_COUNTER;
	}

	public static int getTRAVEL_AGENCY_ID_COUNTER() {
		return ++TRAVEL_AGENCY_ID_COUNTER;
	}
	public static int getHOTEL_IDX() {
		return HOTEL_IDX++;
	}

}

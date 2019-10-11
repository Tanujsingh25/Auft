package com.cg.dao;  

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.cg.beans.Hotel;
import com.cg.beans.TravelAgency;
import com.cg.beans.Users;
import com.cg.util.HotelUtil;  

public class HotelDaoImpl implements HotelDao{  
JdbcTemplate template;  

	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}
	
	public Hotel saveHotel(Hotel hotel) {
		hotel.setId(HotelUtil.getHOTEL_ID_COUNTER());
		HotelUtil.hotels.put(hotel.getId(), hotel);
		return hotel;
	}
	
	public Hotel getHotelById(int id) {
		return HotelUtil.hotels.get(id);
	}
	
	public List<Hotel> getHotels(){
		return new ArrayList(HotelUtil.hotels.values());
	}
	
	public boolean update(Hotel hotel) {
		HotelUtil.hotels.put(hotel.getId(), hotel);
		return true;
	}
	
	public boolean delete(int id) {
		HotelUtil.hotels.remove(id);
		return true;
	}
	
	public Users getUserDetails(String userName) {
		return HotelUtil.users.get(userName);
	}
	public TravelAgency saveTravelAgency(TravelAgency agency) {
		agency.setTravelRegisterationId(HotelUtil.getHOTEL_ID_COUNTER());
		return HotelUtil.agency.put(agency.getTravelRegisterationId(), agency);
	}
	
	public List<TravelAgency> getTravelAgency() {
		return new ArrayList(HotelUtil.agency.values());
	}

	public Users saveUser(Users user) {
		HotelUtil.users.put(user.getUsername(), user);
		return user;
	}

	public TravelAgency getAgencyById(int id) {
		return HotelUtil.agency.get(id);
	}

	public boolean updateAgency(TravelAgency agency) {
		HotelUtil.agency.put(agency.getTravelRegisterationId(), agency);
		return true;
	}

	public boolean deleteAgency(int id) {
		HotelUtil.agency.remove(id);
		return true;
	}
	
}  
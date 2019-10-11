package com.cg.dao;

import java.util.List;

import com.cg.beans.Hotel;
import com.cg.beans.TravelAgency;
import com.cg.beans.Users;

public interface HotelDao {
	public Users getUserDetails(String userName);
	public Hotel saveHotel(Hotel hotel);
	public Users saveUser(Users user);
	public List<Hotel> getHotels();
	public Hotel getHotelById(int id);
	public TravelAgency getAgencyById(int id);
	public boolean update(Hotel hotel);
	public boolean updateAgency(TravelAgency agency);
	public boolean delete(int id);
	public boolean deleteAgency(int id);
	public TravelAgency saveTravelAgency(TravelAgency agency);
	public List<TravelAgency> getTravelAgency();
}

package com.cg.service;

import java.io.FileNotFoundException;
import java.util.List;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Hotel;
import com.cg.beans.TravelAgency;
import com.cg.beans.Users;
import com.cg.dao.HotelDao;
import com.cg.util.HotelUtil;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelDao dao;
	
	public Users getUserDetails(String userName) {
		return dao.getUserDetails(userName);
	}

	public Hotel saveHotel(Hotel hotel) {
		return dao.saveHotel(hotel);
	}

	public List<Hotel> getHotels() {
		return dao.getHotels();
	}

	public Hotel getHotelById(int id) {
		return dao.getHotelById(id);
	}

	public boolean updateHotel(Hotel hotel) {
		return dao.update(hotel);
	}

	public boolean deleteHotel(int id) {
		return dao.delete(id);
	}

	public TravelAgency saveTravelAgency(TravelAgency agency) {
		return dao.saveTravelAgency(agency);
	}

	public List<TravelAgency> getTravelAgency() {
		return dao.getTravelAgency();
	}

	public Users saveUser(Users user) {
		return dao.saveUser(user);
	}

	public TravelAgency getAgencyById(int id) {
		return dao.getAgencyById(id);
	}

	public boolean updateAgency(TravelAgency agency) {
		return dao.updateAgency(agency);
	}

	public boolean deleteAgency(int id) {
		return dao.deleteAgency(id);
	}
	
}

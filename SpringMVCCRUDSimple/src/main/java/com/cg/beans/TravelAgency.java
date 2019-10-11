package com.cg.beans;

public class TravelAgency {
	
	private int travelRegisterationId;
	private String agencyName;
	private String state;
	private String city;
	private String address;
	private String phoneNo;
	private String emailId;
	private String website;
	private Manager manager;
	
	public TravelAgency() {
		super();
	}
	public TravelAgency(int travelRegisterationId, String agencyName, String state, String city, String address,
			String phoneNo, String emailId, String website) {
		super();
		this.travelRegisterationId = travelRegisterationId;
		this.agencyName = agencyName;
		this.state = state;
		this.city = city;
		this.address = address;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.website = website;
	}
	public int getTravelRegisterationId() {
		return travelRegisterationId;
	}
	public void setTravelRegisterationId(int travelRegisterationId) {
		this.travelRegisterationId = travelRegisterationId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((agencyName == null) ? 0 : agencyName.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + travelRegisterationId;
		result = prime * result + ((website == null) ? 0 : website.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelAgency other = (TravelAgency) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (agencyName == null) {
			if (other.agencyName != null)
				return false;
		} else if (!agencyName.equals(other.agencyName))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (travelRegisterationId != other.travelRegisterationId)
			return false;
		if (website == null) {
			if (other.website != null)
				return false;
		} else if (!website.equals(other.website))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TravelAgency [travelRegisterationId=" + travelRegisterationId + ", agencyName=" + agencyName
				+ ", state=" + state + ", city=" + city + ", address=" + address + ", phoneNo=" + phoneNo + ", emailId="
				+ emailId + ", website=" + website + ", manager=" + manager + "]";
	}
	
}

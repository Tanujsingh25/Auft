package com.cg.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.beans.Hotel;
import com.cg.beans.TravelAgency;
import com.cg.beans.Users;
import com.cg.service.HotelService;
import com.sun.scenario.effect.impl.prism.PrImage;

@Controller  
public class HotelController {
	@Autowired
	HotelService service;
	
	 @RequestMapping("/loginpage")
	    public String Login(Model m) {
		 	//System.out.println("inside login");
	    	m.addAttribute("command",new Users());
	    	return "LoginP";
	    }
	    
	 @RequestMapping(value="/login",method = RequestMethod.POST)
	 public String loginUser(@ModelAttribute("command") Users user,HttpSession session,Model m){
		System.out.println(user.toString());
		Users u = service.getUserDetails(user.getUsername());
	    System.out.println(u.toString());
	       	//if(user.getPassword().equals(u.getPassword())) {
	       		session.setAttribute("role", u.getRole());
	       		List<Hotel> listhotel=service.getHotels();  
	       		m.addAttribute("listhotel",listhotel);
	       		String html ="";
	       		for(Hotel hotel : listhotel) {
	       			html="<tr>"+"<td>"+hotel.getId()+"</td>"+"<td>"+hotel.getHotelName()+"</td>"+"<td>"+hotel.getState()+"</td>"+"<td>"+hotel.getCity()+"</td>"+"<td>"+hotel.getAddress()+"</td>"+"<td>"+hotel.getPhone()+"</td>"+"<td>"+hotel.getEmail()+"</td>";
	       		}
	       		
	       		System.out.println(html);
	       		//String html = "<c:forEach var=\"hotel\" items=\"${listhotel}\">"	    
//	       				<c:forEach var="hotel" items="${listhotel}">
//	   	     
//	        	<tr>
//	    		<td>${hotel.id}</td>
//	    		<td>${hotel.hotelName}</td>
//	    	    <td>${hotel.state}</td>
//	    	    <td>${hotel.city}</td>
//	    	    <td>${hotel.address}</td>
//	    	    <td>${hotel.phone}</td>
//	    	    <td>${hotel.email}</td>
//	    	   </tr>
//	    	   </c:forEach>
	       				
	       		//writer.print(html);
	       		m.addAttribute("ht", html);
	       		
	  	     	List<TravelAgency> listagency=service.getTravelAgency();  
	  	     	m.addAttribute("listagency",listagency);
				//if(u.getRole().equals("superadmin"))
					return "SuperAdminServicePage";
//				else if(u.getRole().equals("admin"))
//					return "AdminServicePage";
//				else if(u.getRole().equals("travelagent"))
//					return "";
//				else if(u.getRole().equals("government"))
//					return "";
//				else 
//					return "redirect:/loginpage";
	    	//}
	    	//return "failure";
	 }
	  
//	 @RequestMapping("showsignup")
//	 public String displaySignUp(Model m) {
//		 m.addAttribute("command", new Users());
//		 return "registerPage";
//	 }
//	 
//	 @RequestMapping(value = "signup",method = RequestMethod.POST)
//	 public String signUp(@ModelAttribute("command") Users user) { 
//		 service.saveUser(user);
//		 return "redirect:/loginpage";
//	 }
	 
	 @RequestMapping("homePagesuperadmin")
	 public String homePage(Model m) {
		//m.addAttribute("command",new Hotel());
		 return "SuperAdminServicePage";
	 }
	 
	 @RequestMapping("/addhotel")
	 public String AddHotel(Model m) {
	   	m.addAttribute("command",new Hotel());
	   	return "addhotelpage";
	 }
	    
	    @RequestMapping(value = "/saveHotel",method = RequestMethod.POST)
	    public String saveHotel(@ModelAttribute("hotel") Hotel hotel) {
	    	service.saveHotel(hotel);
	    	return "redirect:/viewhotel";
	    }
	        
	    @RequestMapping("/viewhotel")
	    public String viewHotel(Model m) {
	      List<Hotel> list=service.getHotels();  
	      m.addAttribute("list",list);
	      return "viewHotels";  
	    }
	    
	    @RequestMapping("edithotel")
	    public String editHotel(Model m) {
	    	m.addAttribute("command",new Hotel());
	    	return "editHotelPage";
	    }
	    
	    @RequestMapping(value="findhotel" , method = RequestMethod.POST)
	    public String findHotelById(@ModelAttribute("command") Hotel hotel,Model m) {
	        hotel=service.getHotelById(hotel.getId());  
	        m.addAttribute("command",hotel);
	        return "hoteleditform";
	    }
	    
	    @RequestMapping(value="/edithotel/{id}")  
	    public String editHotelById(@PathVariable int id, Model m){  
	      Hotel hotel=service.getHotelById(id);  
	      m.addAttribute("command",hotel);
	      return "hoteleditform";  
	  } 
	    
	  @RequestMapping(value="/editsave",method = RequestMethod.POST)  
	  public String editsave(@ModelAttribute("hotel") Hotel hotel){  // phle emp tha
	      service.updateHotel(hotel);
		  //service.update(hotel);
	      return "redirect:/viewhotel";  
	  }  
	  
	  @RequestMapping(value="findhoteldetails" , method = RequestMethod.POST)
	  public String findHotelDetails(@ModelAttribute("hotel") Hotel hotel) {
		  service.deleteHotel(hotel.getId());
		  return "SuperAdminServicePage";
	  }
	  @RequestMapping(value="/deletehotel/{id}",method = RequestMethod.GET)  
	  public String delete(@PathVariable int id){  
	      service.deleteHotel(id);
	      return "redirect:/viewhotel";  
	  }   
	    
	  @RequestMapping("addtravelagency")
	  public String addTravelAgency(Model m) {
	    m.addAttribute("command",new TravelAgency());
	    return "addtravelagencypage";
	  }
	    
	  @RequestMapping(value = "savetravelagency", method = RequestMethod.POST)
	  public String saveTravelAgency(@ModelAttribute("command") TravelAgency agency) {
		  System.out.println("inside save travel agency");
	  	  service.saveTravelAgency(agency);
	  	  return "redirect:/viewagency";	  
	  }
	    
	  @RequestMapping("viewagency")
	  public String viewAgency(Model m) {
	      List<TravelAgency> list=service.getTravelAgency();  
	      m.addAttribute("list",list);
		  return "viewAgency";
	  }
	  //editagency
	  @RequestMapping(value="/editagency/{id}")  
	  public String editAgencyById(@PathVariable int id, Model m){  
	      TravelAgency agency=service.getAgencyById(id);  
	      m.addAttribute("command",agency);
	      return "agencyeditform";  
	  } 
	  
	  @RequestMapping(value="/editsaveagency",method = RequestMethod.POST)  
	  public String editSaveAgency(@ModelAttribute("agency") TravelAgency agency){
	      service.updateAgency(agency);
	      return "redirect:/viewagency";  
	  } 
	  //deleteagency
	  @RequestMapping(value="/deleteagency/{id}",method = RequestMethod.GET)  
	  public String deleteAgency(@PathVariable int id){  
	      service.deleteAgency(id);
	      return "redirect:/viewagency";  
	  }   
	  
}
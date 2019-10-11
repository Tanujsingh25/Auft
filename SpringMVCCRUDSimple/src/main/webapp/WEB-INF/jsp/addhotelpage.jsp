<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Hotel</h1>
		<h3>Hotel Details</h3>
       <form:form method="post" action="saveHotel">  
      	<table >  
         <tr>  
          <td>Hotel Name : </td> 
          <td><form:input path="hotelName"  /></td>
         </tr>  
         <tr>  
          <td>State :</td>  
          <td><form:input path="state" /></td>
         </tr> 
         <tr>  
          <td>City :</td>  
          <td><form:input path="city" /></td>
         </tr>
         <tr>  
          <td>address :</td>  
          <td><form:input path="address" /></td>
         </tr>
                  <tr>  
          <td>Phone No :</td>  
          <td><form:input path="phone" /></td>
         </tr> 
         <tr>  
          <td>Email Id :</td>  
          <td><form:input path="email" /></td>
         </tr>
         </table>
         <h3>Manager Details</h3>
         <table>  
         <tr>  
          <td>First Name : </td> 
          <td><form:input path="manager.firstName"  /></td>
         </tr>  
         <tr>  
          <td>Last Name :</td>  
          <td><form:input path="manager.lastName" /></td>
         </tr> 
         <tr>  
          <td>Gender :</td>  
          <td><form:input path="manager.gender" /></td>
         </tr>
         <tr>  
          <td>Email Id :</td>  
          <td><form:input path="manager.emailid" /></td>
         </tr>
                  <tr>  
          <td>Mobile No :</td>  
          <td><form:input path="manager.mobile" /></td>
         </tr> 
         <tr>  
          <td>Address :</td>  
          <td><form:input path="manager.address" /></td>
         </tr>
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  

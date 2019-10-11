<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Agency</h1>
       <form:form method="POST" action="/SpringMVCCRUDSimple/editsaveagency">  
       <table >  
         <tr>
      	 <td></td>  
         <td><form:hidden  path="travelRegisterationId" /></td>
         </tr> 
         <tr>  
          <td>Agency Name : </td> 
          <td><form:input path="agencyName"  /></td>
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
          <td><form:input path="phoneNo" /></td>
         </tr> 
         <tr>  
          <td>Email Id :</td>  
          <td><form:input path="emailId" /></td>
         </tr>
         <tr>  
          <td>Website :</td>  
          <td><form:input path="website" /></td>
         </tr>
         </table>
       
         <h3>Edit Manager Details</h3>
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

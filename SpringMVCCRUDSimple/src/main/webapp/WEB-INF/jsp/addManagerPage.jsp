 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h3>Manager Details</h3>
       <form:form method="post" action="saveManager">  
         
       	 <table >  
         <tr>  
          <td>First Name : </td> 
          <td><form:input path="firstName"  /></td>
         </tr>  
         <tr>  
          <td>Last Name :</td>  
          <td><form:input path="lastName" /></td>
         </tr> 
         <tr>  
          <td>Gender :</td>  
          <td><form:input path="gender" /></td>
         </tr>
         <tr>  
          <td>Email Id :</td>  
          <td><form:input path="emailid" /></td>
         </tr>
                  <tr>  
          <td>Mobile No :</td>  
          <td><form:input path="mobile" /></td>
         </tr> 
         <tr>  
          <td>Address :</td>  
          <td><form:input path="address" /></td>
         </tr>
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
         </table>
         </form:form>
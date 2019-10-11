<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<h1>Sign Up</h1>
	<form:form action="signup" method="post" >
		<table >  
		<tr>
          <td>User Name : </td> 
          <td><form:input path="username" /></td>
         </tr>  
         <tr>  
          <td>Password :</td>  
          <td><form:input path="password" type="password"/></td>
         </tr>   
         <tr>  
          <td></td>
          <td><input type="submit" value="Sign In" /></td>             
         </tr>
        </table> 
	</form:form>

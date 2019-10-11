<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<h1>Login</h1>
	<form:form action="login" method="post" >
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
          <td><input type="submit" value="Login" /></td>
          <td><a href="showsignup">Register Now</a> </td>  
         </tr>
        </table> 
	</form:form>

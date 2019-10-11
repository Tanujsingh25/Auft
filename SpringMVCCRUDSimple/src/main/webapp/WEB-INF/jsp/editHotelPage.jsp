<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<form:form action="findhotel" method = "post">
	<table title="Please Enter Hotel ID">  
      	<tr>
	      	<td> Hotel Id</td>  
	         <td><form:input  path="id" /></td>
         </tr>
                  <tr>  
          <td> </td>  
          <td><input type="submit" value="Find" /></td>  
         </tr>
     </table>
</form:form>
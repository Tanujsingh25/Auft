    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Travel Agency List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>State</th><th>City</th><th>Address</th><th>Phone No</th><th>Email</th><th>Website</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="agency" items="${list}"> 
    <tr>
    <td>${agency.travelRegisterationId}</td>
    <td>${agency.agencyName}</td>
    <td>${agency.state}</td>
    <td>${agency.city}</td>
    <td>${agency.address}</td>
    <td>${agency.phoneNo}</td>
    <td>${agency.emailId}</td>
    <td>${agency.website}</td>
    <td><a href="editagency/${agency.travelRegisterationId}">Edit</a></td>
    <td><a href="deleteagency/${agency.travelRegisterationId}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="loginpage">done</a>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Hotel List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>State</th><th>City</th><th>Address</th><th>Phone No</th><th>Email</th> <th>Edit</th><th>Delete</th></tr>
    <c:forEach var="hotel" items="${list}"> 
    <tr>
    <td>${hotel.id}</td>
    <td>${hotel.hotelName}</td>
    <td>${hotel.state}</td>
    <td>${hotel.city}</td>
    <td>${hotel.address}</td>
    <td>${hotel.phone}</td>
    <td>${hotel.email}</td>
    <td><a href="edithotel/${hotel.id}">Edit</a></td>
    <td><a href="deletehotel/${hotel.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="loginpage">done</a>
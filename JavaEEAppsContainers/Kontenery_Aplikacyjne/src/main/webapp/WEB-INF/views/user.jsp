<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="label.title"/></title>
</head>

<body>
<h2><spring:message code="label.user"/></h2>
<form:form method="POST" action="addUser.html?${_csrf.parameterName}=${_csrf.token}" commandName="user" enctype="multipart/form-data">

<table>
    <tr>
        <td><form:hidden path="id"/>
    </tr>
    	<tr>
		<td><form:label path="login"><spring:message code="label.login"/></form:label></td>
		<td><form:input path="login"/></td>
		<td><form:errors path="login"/></td>
	</tr>
		<tr>
		<td><form:label path="password"><spring:message code="label.password"/></form:label></td>
		<td><form:input path="password"/></td>
		<td><form:errors path="password"/></td>
	</tr>
	<tr>
		<td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
		<td><form:input path="firstname"/></td>
		<td><form:errors path="firstname"/></td>
	</tr>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
		<td><form:input path="lastname"/></td>
		<td><form:errors path="lastname"/></td>
		<tr>
        <td><form:hidden path="pesel.id"/></td>
    </tr>
	<tr>
        <td><form:label path="pesel.PESEL"><spring:message code="label.pesel"/></form:label></td>
        <td><form:input path="pesel.PESEL" /></td>
        <td><form:errors path="pesel.PESEL"/></td>
    </tr>
	<tr>
		<td><form:label path="email"><spring:message code="label.email"/></form:label></td>
		<td><form:input path="email"/></td>
		<td><form:errors path="email"/></td>
	</tr>
	<tr>
		<td><form:label path="telephone"><spring:message code="label.telephone"/></form:label></td>
		<td><form:input path="telephone"/></td>
		<td><form:errors path="telephone"/></td>
	</tr>
	<tr>
		<td><form:label path="address"><spring:message code="label.address"/></form:label></td>
		<td><form:select path="address">
				<c:forEach items="${addressesList}" var="address">
        			<option value="${address.id}" ${address.id == selectedAddress ? 'selected="selected"' : ''}>${address.street}</option>
   				</c:forEach>
		</form:select></td>
		<td><form:errors path="address"/></td>
	</tr>    
		<tr>
		<td><form:label path="enabled"><spring:message code="label.enabled"/></form:label></td>
		<td><form:checkbox path="enabled"/></td>
		<td><form:errors path="enabled"/></td>
	</tr>
	<tr>
		<td><form:label path="userRole"><spring:message code="label.role"/></form:label></td>
		<td><form:select path="userRole" multiple="true">
				<form:options items="${userRoleList}" itemValue="id" itemLabel="role"/>
		</form:select></td>
		<td><form:errors path="userRole"/></td>
	</tr>
	<tr>
 		<td><form:label path="picture"><spring:message code="label.picture"/></form:label>	</td>
 		<td>
	<c:if test="${user.id != 0}">
	
		<c:if test="${not empty user.picture}">
	 	<a href="<c:url value="users/picture.html?userId=${user.id}"/>" target="_blank"><spring:message code="picture.download"/></a>
		</c:if>
	
		<c:if test="${empty user.picture}">
	 	<a><spring:message code="picture.noPicture"/></a>
		</c:if>
		<br>
	</c:if>	
	<input id="picture" name="picture" type="file"/> </td>
    </tr>
	<tr>
		<td colspan="4">
			<c:if test="${user.id==0}">
				<input type="submit" value="<spring:message code="label.addUser"/>"/>
			</c:if>
        	<c:if test="${user.id!=0}">
        		<input type="submit" value="<spring:message code="label.editUser"/>"/>
        	</c:if>
		</td>
	</tr>
</table>

</form:form>

<h3><spring:message code="label.userList"/></h3>
<c:if  test="${!empty userList}">
<table class="data">
	<tr>
   	   <th><spring:message code="label.firstname"/></th>
   	   <th><spring:message code="label.lastname"/></th>
 	   <th><spring:message code="label.email"/></th>
       <th><spring:message code="label.telephone"/></th>
       <th>&nbsp;</th>
       <th>&nbsp;</th>
	</tr>
<c:forEach items="${userList}" var="user">
    <tr>
       <td>${user.firstname} </td>
       <td>${user.lastname} </td>
       <td>${user.email}</td>
       <td>${user.telephone}</td>
       <td><a href="delete/${user.id}.html">delete</a></td>
       <td><a href="users.html?userId=${user.id}">edit</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: mshahid1
  Date: 23-01-2024
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sping" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registrations</title>
</head>
<body>
<h1> Welcome to Registrations </h1>
<form:form modelAttribute="registration">
    <table>
        <tr>
            <td>
                <spring:message code="name"/>
            </td>
            <td>
                <form:input path="name"></form:input>
            </td>
        </tr>
        <tr>
            <td colspan="2">
            <input type="submit" value="Add Registration">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>


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
    <form:errors path="*" cssClass="errorblock" element="div" />
    <table>
        <tr>
            <td>
                <spring:message code="name"/>
            </td>
            <td>
                <form:input path="name"></form:input>
            </td>
            <td>
                <form:errors path="name" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td colspan="4">
            <input type="submit" value="Add Registration">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

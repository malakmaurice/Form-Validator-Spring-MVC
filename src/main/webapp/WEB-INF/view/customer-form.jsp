<%--
  Created by IntelliJ IDEA.
  User: malak_000
  Date: 12/9/2021
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
    <form:form action="processForm" modelAttribute="customer">


        First Name <form:input path="firstName"/>
        <br><br>


        Last Name (*) <form:input path="lasName"/>
        <form:errors path="lasName" cssClass="error"/>
        <br><br>
       Free Passes <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>
        Postal code <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br><br>
        course code <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error"/>
        <br><br>
        <input type="submit" value="submit"/>
    </form:form>
</body>
</html>

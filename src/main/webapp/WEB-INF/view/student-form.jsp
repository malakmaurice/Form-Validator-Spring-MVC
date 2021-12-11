<%--
  Created by IntelliJ IDEA.
  User: malak_000
  Date: 12/6/2021
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>student form</title>
</head>
<body>
  <form:form action="processForm" modelAttribute="student" >
    First Name: <form:input path="firstName"/>
      <br><br>
      Last Name: <form:input path="lastName"/>
      <br><br>
      <form:select path="coun">
        <form:options items="${student.countryOption}"/>
      </form:select>
      <br><br>
      php<form:radiobutton path="favLang" value="php"/>
      python<form:radiobutton path="favLang" value="python"/>
      c++<form:radiobutton path="favLang" value="c++"/>
      java<form:radiobutton path="favLang" value="java"/>
    <br><br>
    Windows<form:checkbox path="operatingSystem" value="windows"/>
    Linx<form:checkbox path="operatingSystem" value="linux"/>
    MAc<form:checkbox path="operatingSystem" value="mac"/>
    <input type="submit" value="submit">
  </form:form>
</body>
</html>

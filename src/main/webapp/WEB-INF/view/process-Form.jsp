<%--
  Created by IntelliJ IDEA.
  User: malak_000
  Date: 12/6/2021
  Time: 5:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>process Form</title>
</head>
<body>

the name is : ${student.firstName}  ${student.lastName}
<br><br>
the country is : ${student.coun}
<br><br>
my fav language is : ${student.favLang}
<br><br>
Operation System is :
<ul>
    <c:forEach var="i" items="${student.operatingSystem}">
        <li>${i}</li>
    </c:forEach>
</ul>
</body>
</html>

<%@ taglib prefix="h" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

Owner: <h:out value="${House.owner}"/>
Address: <h:out value="${House.address}"/>
Address: <h:out value="${House.noOfBedrooms}"/>

</body>
</html>
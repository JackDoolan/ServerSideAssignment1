
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
   <title>List of Houses</title>
</head>
<body>




<table>
    <tr>
        <th>
            Owner
        </th>

        <th>
            Address
        </th>

        <th>
            Number of Bedrooms
        </th>
    </tr>

    <c:forEach items = "${houses}" var = "House">

        <tr>
            <td><c:if test="${House.owner == ''}">
                <c:out value = "Owner Unknown" />
            </c:if>
                <c:if test="${House.owner != ''}">
                    <c:out value = "${House.owner}" />
                </c:if>
            </td>

            <td><c:if test="${House.address == ''}">
                <c:out value = "Address Unknown" />
            </c:if>
                <c:if test="${House.address != ''}">
                    <c:out value = "${House.address}" />
                </c:if>
            </td>

            <td><c:if test="${House.noOfBedrooms == ''}">
                <c:out value = "0" />
            </c:if>
                <c:if test="${House.noOfBedrooms != ''}">
                    <c:out value = "${House.noOfBedrooms}" />
                </c:if>
            </td>
        </tr>

    </c:forEach>


</table>

</body>
</html>

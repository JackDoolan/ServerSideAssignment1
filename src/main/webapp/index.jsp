<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<form method="post" action="CreateHouseServlet">
    <input type="text" name="houseOwner"/>
    <input type="text" name="houseAddress"/>
    <input type="text" name="houseNoOfBedrooms"/>
    <input type="submit" value="Show House"/>
</form>

<br/>
<form method="post" action="ShowHouseServlet">
    <input type="text" name="houseOwner"/>
    <input type="text" name="houseAddress"/>
    <input type="text" name="houseNoOfBedrooms"/>
    <input type="submit" value="List Houses"/>
</form>
</body>
</html>
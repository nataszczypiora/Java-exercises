<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista dzielnikow</title>
</head>
<font size="25">Lista dzielnikow</font>
<table> 
<c:forEach var="element" items="${dzielniki}" >
<tr> <td>${element}</td></tr>
</c:forEach>
</table>
</html>
</body>
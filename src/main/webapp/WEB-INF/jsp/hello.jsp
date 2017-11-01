<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType = "text/html; charset = UTF-8" %>
<html>
<head>
    <title>Multiplication</title>
</head>

<body>
<form:form action="/hello" method="POST">
<table>
    <tr><td>First number</td> <td>Second number</td> <td>Result</td></tr><br>
    <tr><td><input type="number" name="chislo1">X</td>
        <td><input type="number" name="chislo2">=</td>
        <td>${message1}</td>
        <td><input type="submit" name="calculate" value="Calculate"></td>
    </tr>
</table>
</form:form>
</body>
</html>
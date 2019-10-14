<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
</body>
<table>
    <tr>
        <th>ID</th>
        <th>Tên</th>
    </tr>
    <c:forEach items="${studentList}" var="s" >
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
        </tr>
    </c:forEach>
</table>
</html>

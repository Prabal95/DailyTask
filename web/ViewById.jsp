<%--
  Created by IntelliJ IDEA.
  User: dz-jp-53
  Date: 3/1/21
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read</title>
</head>
<body>
<form action="index.jsp">
    <input type="submit" value="Home">
</form>
<form action="" method="post">
    <table>

        <thead>
        <tr class="table100-head">
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Salary</th>
            <th>City</th>
            <th>Mobile</th>
            <th>Email</th>
            <th>Gender</th>
        </tr>
        </thead>

        <tbody>

        <tr>
            <td><%=request.getAttribute("id") %></td>
            <td><%=request.getAttribute("name") %></td>
            <td><%=request.getAttribute("age") %></td>
            <td><%=request.getAttribute("salary") %></td>
            <td><%=request.getAttribute("city") %></td>
            <td><%=request.getAttribute("mob") %></td>
            <td><%=request.getAttribute("email") %></td>
            <td><%=request.getAttribute("gen") %></td>
        </tr>

        </tbody>
    </table>
</form>
</body>
</html>

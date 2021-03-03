
<%@ page import="com.demo.Employee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dz-jp-53
  Date: 2/23/21
  Time: 3:20 PM
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
        <%
            ArrayList<Employee> list = (ArrayList<Employee>)request.getAttribute("data");
            for(Employee employee:list){%>
        <tr>
            <td><%=employee.getId() %></td>
            <td><%=employee.getName() %></td>
            <td><%=employee.getAge() %></td>
            <td><%=employee.getSalary() %></td>
            <td><%=employee.getCity() %></td>
            <td><%=employee.getMob() %></td>
            <td><%=employee.getEmail() %></td>
            <td><%=employee.getGen() %></td>
        </tr>
        <%}%>
        </tbody>
    </table>
</form>
</body>
</html>

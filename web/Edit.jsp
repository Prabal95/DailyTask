<%--
  Created by IntelliJ IDEA.
  User: dz-jp-53
  Date: 2/23/21
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="update" method="post">
    <table>
        <tr>
            <td>Add Id : </td><td><input type="text" name="id" value="<%= request.getAttribute("id")%>" placeholder="Enter Id (Numbers Only)" pattern="[0-9]+" required></td>
        </tr>
        <tr>
            <td>Add Name : </td><td><input type="text" name="name" size="25" value="<%= request.getAttribute("name")%>" placeholder="Enter Name (Use Only Letters)" pattern="[A-Za-z\s]+" size="25" required></td>
        </tr>
        <tr>
            <td>Add Age : </td><td><input type="text" name="age" size="2" value="<%= request.getAttribute("age")%>" placeholder="Enter Age (Numbers Only)" maxlength="2" pattern="[0-9]+" required></td>
        </tr>
        <tr>
            <td>Add Salary : </td><td><input type="text" name="salary" size="10" value="<%= request.getAttribute("salary")%>" placeholder="Enter Salary" pattern="[0-9]+" size="10" required></td>
        </tr>
        <tr>
            <td>Add City : </td><td><input type="text" name="city" value="<%= request.getAttribute("city")%>" placeholder="Enter City (Use Only Letters)" pattern="[A-Za-z\s]+" required></td>
        </tr>
        <tr>
            <td>Add Mobile : </td><td><input type="text" name="mob" value="<%= request.getAttribute("mob")%>" placeholder="Enter Mobile Number (Numbers Only)" maxlength="10" minlength="10" pattern="[0-9]+" required></td>
        </tr>
        <tr>
            <td>Add Email : </td><td><input type="text" name="email" value="<%= request.getAttribute("email")%>" required></td>
        </tr>
        <tr>
            <td>Add Gender : </td>
            <td><select name="gen" value="<%= request.getAttribute("gen")%>" required>
                <option  disabled>Choose...</option>
                <option>Male</option>
                <option>Female</option>
            </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="Click To Update"></td>
        </tr>
    </table>
</form>
</body>
</html>

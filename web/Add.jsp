<%--
  Created by IntelliJ IDEA.
  User: dz-jp-53
  Date: 2/23/21
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form action="add" method="post">
    <table>

        <tr>
            <td>Enter Name : </td><td><input type="text" name="name" placeholder="Enter Name (Use Only Letters)" pattern="[A-Za-z\s]+" size="25" required></td>
        </tr>
        <tr>
            <td>Enter Age : </td><td><input type="text" name="age" placeholder="Enter Age (Numbers Only)" maxlength="2" pattern="[0-9]+" required></td>
        </tr>
        <tr>
            <td>Enter Salary : </td><td><input type="text" name="salary" placeholder="Enter Salary" pattern="[0-9]+" size="10" required></td>
        </tr>
        <tr>
            <td>Enter City : </td><td><input type="text" name="city" placeholder="Enter City (Use Only Letters)" pattern="[A-Za-z\s]+" required></td>
        </tr>
        <tr>
            <td>Enter Mobile : </td><td><input type="text" name="mob" placeholder="Enter Mobile Number (Numbers Only)" maxlength="10" minlength="10" pattern="[0-9]+" required></td>
        </tr>
        <tr>
            <td>Enter Email : </td><td><input type="email" name="email" placeholder="abc@xyz.com" required></td>
        </tr>
        <tr>
            <td>Add Gender : </td>
            <td><select name="gen" required>
                <option  disabled>Choose...</option>
                <option>Male</option>
                <option>Female</option>
            </select></td>
        </tr>
        <tr>
            <td><input type="submit" value="Click To Add"></td>
        </tr>
    </table>
</form>
</body>
</html>

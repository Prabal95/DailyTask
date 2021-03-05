package com.employee.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	public static Connection getCon() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","Prabal@9");

	}
}

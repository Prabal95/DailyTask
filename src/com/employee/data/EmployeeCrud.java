package com.employee.data;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employee.beans.EmployeeBean;


public class EmployeeCrud {

	public static int insert(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int status = 0;
		Connection con = Db.getCon();
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setString(3, bean.getAge());
		ps.setString(4, bean.getSalary());
		ps.setString(5, bean.getCity());
		ps.setString(6, bean.getMob());
		ps.setString(7, bean.getEmail());
		ps.setString(8, bean.getGender());
		status = ps.executeUpdate();
		con.close();
		return status;
	}
	
	public static int update(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		int status = 0;
		Connection con = Db.getCon();
		PreparedStatement ps = con.prepareStatement("update employee set name=?,age=?,salary=?,city=?,mob=?,email=?,gender=? where id=?");
		ps.setString(1, bean.getName());
		ps.setString(2, bean.getAge());
		ps.setString(3, bean.getSalary());
		ps.setString(4, bean.getCity());
		ps.setString(5, bean.getMob());
		ps.setString(6, bean.getEmail());
		ps.setString(7, bean.getGender());
		ps.setInt(8, bean.getId());
		status = ps.executeUpdate();
		con.close();
		return status;
	}
	
	public static List<EmployeeBean> getAllRecords() throws ClassNotFoundException, SQLException{
		List<EmployeeBean> list = new ArrayList<EmployeeBean>();
		Connection con = Db.getCon();
		PreparedStatement ps = con.prepareStatement("select * from Employee");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			EmployeeBean bean = new EmployeeBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setAge(rs.getString(3));
			bean.setSalary(rs.getString(4));
			bean.setCity(rs.getString(5));
			bean.setMob(rs.getString(6));
			bean.setEmail(rs.getString(7));
			bean.setGender(rs.getString(8));
			list.add(bean);
		}
		con.close();
		return list;
	}

	public static EmployeeBean getRecordById(int id) throws ClassNotFoundException, SQLException, IOException {
		EmployeeBean bean = new EmployeeBean();
		Connection con = Db.getCon();
		PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setAge(rs.getString(3));
			bean.setSalary(rs.getString(4));
			bean.setCity(rs.getString(5));
			bean.setMob(rs.getString(6));
			bean.setEmail(rs.getString(7));
			bean.setGender(rs.getString(8));
		}
		con.close();
		return bean;
	}
	
	public static EmployeeBean getRecordByEmail(String email) throws ClassNotFoundException, SQLException, IOException {
		EmployeeBean bean = new EmployeeBean();
		Connection con = Db.getCon();
		PreparedStatement ps = con.prepareStatement("select * from employee where email=?");
		ps.setString(7, email);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setAge(rs.getString(3));
			bean.setSalary(rs.getString(4));
			bean.setCity(rs.getString(5));
			bean.setMob(rs.getString(6));
			bean.setEmail(rs.getString(7));
			bean.setGender(rs.getString(8));
		}
		con.close();
		return bean;
	}
	
	public static int delete(int id) throws ClassNotFoundException, SQLException {
		int status = 0;
		Connection con = Db.getCon();
		PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
		ps.setInt(1, id);
		status = ps.executeUpdate();
		con.close();
		return status;
	}
}

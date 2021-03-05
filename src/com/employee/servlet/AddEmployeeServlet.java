package com.employee.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.beans.EmployeeBean;
import com.employee.data.EmployeeCrud;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name,age,salary,city,mob,email,gender;

    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
		
		EmployeeBean bean = new EmployeeBean(name,age,salary,city,mob,email,gender);
		try {
			EmployeeCrud.insert(bean);
			request.getRequestDispatcher("Index.jsp").forward(request, response);
//			response.sendRedirect("ViewAccountantServlet?lid=1");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		name = request.getParameter("name");
		age = request.getParameter("age");
		salary = request.getParameter("salary");
		city = request.getParameter("city");
		mob = request.getParameter("mob");
		email = request.getParameter("email");
		gender = request.getParameter("gender");
	}

}

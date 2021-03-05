package com.employee.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.beans.EmployeeBean;
import com.employee.data.EmployeeCrud;

@WebServlet("/EditEmployeeServlet")
public class EditEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int id;
	
    public EditEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
		
		EmployeeBean bean = new EmployeeBean(id);
		try {
			bean = EmployeeCrud.getRecordById(id);
			
			request.setAttribute("id", bean.getId());
			request.setAttribute("name", bean.getName());
			request.setAttribute("age", bean.getAge());
			request.setAttribute("salary", bean.getSalary());
			request.setAttribute("city", bean.getCity());
			request.setAttribute("mob", bean.getMob());
			request.setAttribute("email", bean.getEmail());
			request.setAttribute("gender", bean.getGender());
			
			request.getRequestDispatcher("/EditEmployee.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		id = Integer.parseInt(request.getParameter("id"));
	}

}

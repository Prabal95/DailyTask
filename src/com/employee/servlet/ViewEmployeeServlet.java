package com.employee.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.beans.EmployeeBean;
import com.employee.data.EmployeeCrud;



@WebServlet("/ViewEmployeeServlet")
public class ViewEmployeeServlet extends HttpServlet {
//	int id;
	private static final long serialVersionUID = 1L;

    public ViewEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
		
		try {
			
			List<EmployeeBean> list = EmployeeCrud.getAllRecords();
			request.setAttribute("data", list);
			
			request.getRequestDispatcher("/EmployeeList.jsp").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
//		id = Integer.parseInt(request.getParameter("id"));
	}

}

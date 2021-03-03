package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewByIdServlet extends HttpServlet {
    static int id;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        id = Integer.parseInt(request.getParameter("id"));
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

        Employee  employee = new Employee();

        try {
            employee = CrudOperations.getEmployeeById(id);
        } catch (CustomException e) {
            e.printStackTrace();
        }

        request.setAttribute("id", employee.getId());
        request.setAttribute("name", employee.getName());
        request.setAttribute("age", employee.getAge());
        request.setAttribute("salary", employee.getSalary());
        request.setAttribute("city", employee.getCity());
        request.setAttribute("mob", employee.getMob());
        request.setAttribute("email", employee.getEmail());
        request.setAttribute("gen", employee.getGen());

        request.getRequestDispatcher("/ViewById.jsp").forward(request, response);

    }
}

package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {

    int id;
    String name,age,salary,city,mob,email,gen;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");

        id = Integer.parseInt(request.getParameter("id"));
        name = request.getParameter("name");
        age = request.getParameter("age");
        salary = request.getParameter("salary");
        city = request.getParameter("city");
        mob = request.getParameter("mob");
        email = request.getParameter("email");
        gen = request.getParameter("gen");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

        Employee employee = new Employee(id,name,age,salary,city,mob,email,gen);

        CrudOperations.updateEmployee(employee);
        request.getRequestDispatcher("").forward(request, response);

    }

}

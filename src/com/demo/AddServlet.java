package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class AddServlet extends HttpServlet {
    protected String name,age,salary,city,mob,email,gen;


    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

        Employee employee = new Employee(name,age,salary,city,mob,email,gen);

        try {
            CrudOperations.add(employee);
        } catch (CustomException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        name = request.getParameter("name");
        age = request.getParameter("age");
        salary = request.getParameter("salary");
        city = request.getParameter("city");
        mob = request.getParameter("mob");
        email = request.getParameter("email");
        gen = request.getParameter("gen");

    }
}

package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    int id;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        id = Integer.parseInt(request.getParameter("id"));
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);

//        Employee employee = new Employee(id);

        try {
            CrudOperations.deleteEmployee(id);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("").forward(request, response);

    }
}

package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ReadServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

        List<Employee> list = CrudOperations.view();
        request.setAttribute("data", list);

        request.getRequestDispatcher("/Read.jsp").forward(request, response);



    }

}

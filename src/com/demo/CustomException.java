package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomException extends Exception {

    public CustomException(String s, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {

        super(s);
        response.setContentType("text/html");
        request.getRequestDispatcher("").forward(request, response);
    }

//    public CustomException(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
//        response.setContentType("text/html");
//
//        request.getRequestDispatcher("").forward(request, response);
//    }

    public CustomException() {

    }

    public CustomException(String s) {
    }
}

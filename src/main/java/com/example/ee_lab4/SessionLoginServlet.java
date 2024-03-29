package com.example.ee_lab4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionLoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    request.getRequestDispatcher("link-cookie.jsp").include(request, response);

    String name = request.getParameter("name");
    String password = request.getParameter("password");

    if(password.equals("admin123")){
      out.print("Welcome, " + name);
      HttpSession session=request.getSession();
      session.setAttribute("name", name);

    } else {
      out.print("Sorry, username or password error!");
      request.getRequestDispatcher("login-cookie.jsp").include(request, response);
    }
    out.close();
  }
}

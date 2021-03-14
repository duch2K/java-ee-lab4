package com.example.ee_lab4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionProfileServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    request.getRequestDispatcher("link-session.jsp").include(request, response);

    HttpSession session = request.getSession(false);
    if (session != null) {
      String name = (String) session.getAttribute("name");
      out.print("Hello, " + name + " Welcome to Profile");

    } else {
      out.print("Please login first");
      request.getRequestDispatcher("login-session.jsp").include(request, response);
    }
    out.close();
  }
}

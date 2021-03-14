package com.example.ee_lab4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CookieProfileServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    request.getRequestDispatcher("link-cookie.jsp").include(request, response);

    Cookie ck[] = request.getCookies();

    if (ck != null) {
      String name = "";

      for (Cookie c : ck) {
        if (c.getName().equals("name")) {
          name = c.getValue();
        }
      }

      if (name.equals("") || name == null) {
        out.print("Please login first");
        request.getRequestDispatcher("login-cookie.jsp").include(request, response);

      } else {
        out.print("<b>Welcome to Profile</b>");
        out.print("<br>Welcome, " + name);
      }

    } else {
      out.print("Please login first");
      request.getRequestDispatcher("login-cookie.jsp").include(request, response);
    }
    out.close();
  }
}

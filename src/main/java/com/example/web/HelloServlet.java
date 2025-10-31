package com.example.web;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2 style='color:blue;'>Colors and Numbers</h2>");
        out.println("<ul>");
        out.println("<li style='color:red;'>Red - 1</li>");
        out.println("<li style='color:green;'>Green - 2</li>");
        out.println("<li style='color:blue;'>Blue - 3</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}

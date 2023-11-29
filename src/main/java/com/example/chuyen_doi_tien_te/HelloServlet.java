package com.example.chuyen_doi_tien_te;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/x")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        float VN = Float.parseFloat(request.getParameter("USD"));
        float USD = Float.parseFloat(request.getParameter("VN"));
        float vn = VN * USD;
        PrintWriter c = response.getWriter();
        c.println("<html>");
        c.println("USD" + " : " + USD);
        c.println("VN" + " + " + VN);
        c.println("vnd" + " : " + vn);
        c.println("</html>");
    }
}
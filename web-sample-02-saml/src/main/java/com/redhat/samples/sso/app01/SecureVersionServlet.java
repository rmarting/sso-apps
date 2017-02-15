package com.redhat.samples.sso.app01;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VersionServlet
 */
@WebServlet(displayName = "SecureVersionServlet", urlPatterns = "/secure/version")
public class SecureVersionServlet extends HttpServlet {

    private static final long serialVersionUID = 8854907880540380844L;

    private static final String VERSION = "1.0";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecureVersionServlet() {
        super();
    }

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Principal principal = request.getUserPrincipal();

        response.setContentType("text/html");
        response.getWriter().write("<html><body>");
        response.getWriter().write("<h2>Version " + VERSION + "</h2>");
        response.getWriter().write("<h2>User ID " + principal.toString() + "</h2>");
        response.getWriter().write("</body></html>");
    }

}

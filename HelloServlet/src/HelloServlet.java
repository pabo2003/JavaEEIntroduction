import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //request
        String servletPath = req.getServletPath();
        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        String method = req.getMethod();
        String pathInfo = req.getPathInfo();
        String remoteUser = req.getRemoteUser();

        System.out.println("Servlet path:"+servletPath);
        System.out.println("Request URI:"+requestURI);
        System.out.println("Context path:"+contextPath);
        System.out.println("Request method:"+method);
        System.out.println("Path Information:"+pathInfo);
        System.out.println("Remote user:"+remoteUser);

        //response
        //PrintWriter out =resp.getWriter();
        //out.println("doGet method is invoked!");
        //out.println("<h1 style=\"color:green\">Name:Udara San</h1>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.println("doPost method is invoked!");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.println("doDelete method is invoked!");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.println("doPut method is invoked!");
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out =resp.getWriter();
        out.println("doOptions method is invoked!");
    }
}
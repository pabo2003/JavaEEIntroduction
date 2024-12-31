import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/auth/*")
public class WildCardMapping extends HttpServlet {
    //example can include methods to check username and password
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Wild Card Mapping is Working");
        /*PrintWriter out = resp.getWriter();
        out.println("Wild Card Mapping is Working");*/
    }
}

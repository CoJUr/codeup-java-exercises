import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet
public class ServletTest extends HttpServlet{



    protected <HttpServletResponse> void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, world</h1>");
    }
}

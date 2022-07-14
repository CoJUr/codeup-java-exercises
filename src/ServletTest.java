//
//import java.io.*;
//import java.net.InetSocketAddress;
//import java.util.concurrent.Executor;
//import javax.servlet.*;
//import javax.servlet.http.*;
//
//@WebServlet (name = "ServletTest", urlPatterns = "/hello-world")
//public class ServletTest extends HttpServlet{
//
//
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h1>Hello, world</h1>");
//    }
//}


//public class ViewAllProductsServlet extends HttpServerProvider {
//
//    @Override
//    public HttpServer createHttpServer(InetSocketAddress addr, int backlog) throws IOException {
//        return null;
//    }
//
//    @Override
//    public HttpsServer createHttpsServer(InetSocketAddress addr, int backlog) throws IOException {
//        return null;
//    }
//}
//
//public class UserLoginServlet extends HttpServer {
//
//    @Override
//    public void bind(InetSocketAddress addr, int backlog) throws IOException {
//
//    }
//
//    @Override
//    public void start() {
//
//    }
//
//    @Override
//    public void setExecutor(Executor executor) {
//
//    }
//
//    @Override
//    public Executor getExecutor() {
//        return null;
//    }
//
//    @Override
//    public void stop(int delay) {
//
//    }
//
//    @Override
//    public HttpContext createContext(String path, HttpHandler handler) {
//        return null;
//    }
//
//    @Override
//    public HttpContext createContext(String path) {
//        return null;
//    }
//
//    @Override
//    public void removeContext(String path) throws IllegalArgumentException {
//
//    }
//
//    @Override
//    public void removeContext(HttpContext context) {
//
//    }
//
//    @Override
//    public InetSocketAddress getAddress() {
//        return null;
//    }
//}

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Register extends HttpServlet { protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException { res.getWriter().println("Registration Successful"); } }
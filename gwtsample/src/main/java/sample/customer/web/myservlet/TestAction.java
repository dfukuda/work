package sample.customer.web.myservlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="test",urlPatterns={"/test"})
public class TestAction   extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		RequestDispatcher rd = context.getRequestDispatcher("/test.jsp");
		rd.forward(req, res);
		return;
	}
}

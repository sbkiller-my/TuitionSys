package projTuition.controller;
import projTuition.model.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class signupServlet
 */
@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public signupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 adminBean tb = new adminBean();
		 
		 tb.setUsername(request.getParameter("username"));
		 tb.setPassword(request.getParameter("password"));
		 tb.setEmail(request.getParameter("email"));
		 tb.setFirst(request.getParameter("firstname"));
		 tb.setLast(request.getParameter("lastname"));
		 
		 response.setContentType("text/html");
			//PrintWriter pw = response.getWriter();
	}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangePassword
 */
public class ChangePassword extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String npassword = request.getParameter("npassword");
		
		HttpSession session = request.getSession();
		String username = (String)session.getAttribute("username");
		
		CustomerModel m = new CustomerModel();
		m.setNpassword(npassword);
		m.setCustomerUsername(username);
		
		int rows = m.changePassword();
		if(rows==0) {
			response.sendRedirect("/BankApplicationSystem/passwordUpdateFailure.html");
		}else {
			response.sendRedirect("/BankApplicationSystem/passwordUpdateSuccess.html");
		}
	}

}

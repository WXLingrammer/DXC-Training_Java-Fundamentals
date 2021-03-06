
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccount
 */
public class CreateAccount extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		
		Model m = new Model();
		m.setName(name);
		m.setUn(un);
		m.setPwd(pwd);
		m.setEmail(email);
		
		int rows = m.createAccount();
		if(rows==0) {
			response.sendRedirect("/SigninApplication/failure.html");
		}else {
			response.sendRedirect("/SigninApplication/success.html");
		}
		
	}

}

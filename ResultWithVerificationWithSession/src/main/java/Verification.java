import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Verification
 */
public class Verification extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		if(id.length()==0) {
			response.sendRedirect("/ResultWithVerificationWithSession/error.html");
		}else {
			request.getServletContext().getRequestDispatcher("/GetResult").forward(request, response);
		}
	}

}

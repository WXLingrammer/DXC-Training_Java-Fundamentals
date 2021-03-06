

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServiceRequest
 */
public class ServiceRequest extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String service = request.getParameter("servicerequest");
		HttpSession session = request.getSession();
		String cun = (String)session.getAttribute("cun");
		
		Model m = new Model();
		m.setCun(cun);
		m.setCarService(service);
		
		int rows = m.updateCarService();
		if(rows == 0) {
			response.sendRedirect("/CarServiceSystem/serviceRequestFailure.html");
		}else {
			response.sendRedirect("/CarServiceSystem/serviceRequestSuccess.jsp");
		}
	}

}

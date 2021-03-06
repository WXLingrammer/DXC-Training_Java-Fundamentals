

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckUpdate
 */
public class CheckUpdate extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String cun = (String)session.getAttribute("cun");
		
		Model m = new Model();
		m.setCun(cun);
		int x = m.checkUpdate();
		String status = m.getCarStatus();
		
		session.setAttribute("status", status);
		
		if(x==1) {
			response.sendRedirect("/CarServiceSystem/checkUpdateSuccess.jsp");
		}else {
			response.sendRedirect("/CarServiceSystem/checkUpdateFailure.html");
		}
	}

}

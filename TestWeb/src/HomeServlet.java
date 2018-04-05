

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;
import modules.Summator;

/**
 *  implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private Summator summator;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int arg1 = Integer.parseInt(request.getParameter("number1"));
			int arg2 = Integer.parseInt(request.getParameter("number2"));
			
			int summa = summator.addTwoNumbers(arg1, arg2);
			request.getSession().setAttribute("summa", summa);
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
		//doGet(request, response);
	}

}

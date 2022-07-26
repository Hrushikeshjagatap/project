package contrlloer_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.regiDAO;
import model.regipojo;

/**
 * Servlet implementation class regictrl
 */
public class regictrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regictrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter pw=response.getWriter();
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String gender=request.getParameter("gender");
	String country=request.getParameter("country");
	String phno=request.getParameter("phno");
	
	regipojo rpojo=new regipojo(name, email, password, gender, country, serialVersionUID);
	regiDAO dao=new regiDAO();
	
	try {
		boolean res=dao.insert(rpojo);
		if(res)
		{
			pw.write("login page");
		   RequestDispatcher rd=request.getRequestDispatcher("index.html");
		   rd.forward(request, response);
		}
		else
		{

			pw.write("registreation failed");
		   RequestDispatcher rd=request.getRequestDispatcher("regi.html");
		   rd.include(request, response);
		}
		}
	
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

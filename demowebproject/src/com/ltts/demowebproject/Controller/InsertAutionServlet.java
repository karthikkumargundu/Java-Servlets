package com.ltts.demowebproject.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.demowebproject.Dao.AutionDao;
import com.ltts.demowebproject.Dao.TeamDao;
import com.ltts.demowebproject.model.Aution;
import com.ltts.demowebproject.model.Team;

/**
 * Servlet implementation class InsertAutionServlet
 */
@WebServlet("/InsertAutionServlet")
public class InsertAutionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAutionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int no=Integer.parseInt(request.getParameter("Autionid"));
		int no1=Integer.parseInt(request.getParameter("Playerid"));
		int no2=Integer.parseInt(request.getParameter("teamid"));
		int no3=Integer.parseInt(request.getParameter("year"));
		int no4=Integer.parseInt(request.getParameter("amount"));
		Aution  a=new Aution(no,no1,no2,no3,no4);
		System.out.println("Inside Servlet: "+a);
		AutionDao pd=new AutionDao();
		boolean b=false;
		try {
			b=pd.insertAution(a); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

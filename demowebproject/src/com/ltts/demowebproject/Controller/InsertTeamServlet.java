package com.ltts.demowebproject.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.demowebproject.Dao.PlayerDao;
import com.ltts.demowebproject.Dao.TeamDao;
import com.ltts.demowebproject.model.Player;
import com.ltts.demowebproject.model.Team;

/**
 * Servlet implementation class InsertTeamServlet
 */
@WebServlet("/InsertTeamServlet")
public class InsertTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeamServlet() {
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
		
		
		int no=Integer.parseInt(request.getParameter("teamid"));
		String name=request.getParameter("teamname");
		Team  t=new Team(no,name);
		System.out.println("Inside Servlet: "+t);
		TeamDao pd=new TeamDao();
		boolean b=false;
		try {
			b=pd.insertTeam(t); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

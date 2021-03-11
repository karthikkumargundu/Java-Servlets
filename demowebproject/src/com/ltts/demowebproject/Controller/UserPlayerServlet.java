package com.ltts.demowebproject.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.demowebproject.Dao.PlayerDao;
import com.ltts.demowebproject.Dao.UserDao;
import com.ltts.demowebproject.model.Player;
import com.ltts.demowebproject.model.User;

/**
 * Servlet implementation class UserPlayerServlet
 */
@WebServlet("/UserPlayerServlet")
public class UserPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserPlayerServlet() {
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
		 PrintWriter out = response.getWriter();  
		 	String emailid=request.getParameter("uemailid");
			int mobileno=Integer.parseInt(request.getParameter("uMobilenumber"));
			String name=request.getParameter("uname");
			String password=request.getParameter("upassword");
			String address=request.getParameter("uaddress");
			int DOB=Integer.parseInt(request.getParameter("udateofbirth"));
			User u=new User(emailid,mobileno,name,password,address,DOB);
			System.out.println("Inside Servlet: "+u);
			UserDao pd=new UserDao();
			boolean b=false;
			
			RequestDispatcher rd=null;
			try {
				b=pd.insertUser(u); // Control TRanfers to Dao file
				rd=request.getRequestDispatcher("success.html");
				rd.forward(request, response);
				//System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already user  Used: "+e);
				rd=request.getRequestDispatcher("adduser.html");
				rd.include(request, response);
				e.printStackTrace();
	}

	}
}

package com.nds.pkg;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;

import connections.publication;
import connections.subscriptions;
/**
 * Servlet implementation class SubAddSrvlt
 */
@WebServlet("/SubAddSrvlt")
public class SubAddSrvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubAddSrvlt() {
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
	 * @11see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//String cid = request.getParameter("CID");
//		String f = request.getParameter("first");
//		System.out.println(request.getParameter("CID"));
//		HttpSession session = request.getSession();
//		request.getRequestDispatcher("/SubscriptionAdd.jsp").forward(request, response);
//		//request.setAttribute("first", f);
		String s = request.getParameter("add");
		System.out.println(s);
		if(s.matches("Add")){
<<<<<<< HEAD
			request.setAttribute("CID", 0);
			ArrayList<String> results = publication.getSearchPublications("*SEARCHFORSUBS*", "*SEARCHFORSUBS*");
			String r="";
			
			for(int i=0;i<results.size();i++){
				r += results.get(i);
			}
			request.setAttribute("results", r);
			
			request.getRequestDispatcher("/SubscriptionAdd.jsp").forward(request, response);
			
=======
			System.out.println("In add");
			request.setAttribute("CID", 0);
			response.setHeader("REFRESH", "5");
			request.getRequestDispatcher("/SubscriptionAdd.jsp").forward(request, response);
>>>>>>> a6dcfcfcbca8a4c07535ca5f7ef92de01fa8f224
		}else if(s.matches("Edit Customer Subscriptions")){
			ArrayList<String> results = publication.getSearchPublications("*SEARCHFORSUBS*", "*SEARCHFORSUBS*");
			String r="";
			
			for(int i=0;i<results.size();i++){
				r += results.get(i);
<<<<<<< HEAD
=======
		
>>>>>>> a6dcfcfcbca8a4c07535ca5f7ef92de01fa8f224
			}
			request.setAttribute("results", r);
			request.getRequestDispatcher("/SubscriptionAdd.jsp").forward(request, response);
		}else if(s.equals("Add subscription")){
			String pid = request.getParameter("addid");
			String cid = request.getParameter("CID");
			System.out.println("PID: " + pid + "\nCID: " + cid);
<<<<<<< HEAD
			request.setAttribute("errorMsg", "Subscription Added Successfully!");
			request.getRequestDispatcher("/CustomerAdd.jsp");
			//subscriptions sub = new subscriptions(Integer.parseInt(cid), Integer.parseInt(pid));
=======
			subscriptions sub = new subscriptions(Integer.parseInt(cid), Integer.parseInt(pid));
>>>>>>> a6dcfcfcbca8a4c07535ca5f7ef92de01fa8f224
			
		}
	}
	public void addSubscription(){
		
	}

}

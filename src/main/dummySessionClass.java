package main;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/test_session")
public class dummySessionClass extends HttpServlet {

	public dummySessionClass() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	    private static final long serialVersionUID = 1L;
	    
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	         
	        HttpSession session = request.getSession();
	         
	        PrintWriter writer = response.getWriter();
	        writer.println("Session ID: " + session.getId());
	        writer.println("Creation Time: " + new Date(session.getCreationTime()));
	        writer. println("Last Accessed Time: " + new Date(session.getLastAccessedTime()));
	        
	        Customer cust1=new Customer("ND","ND@mail.com",5,"F","IND");
	        session.setAttribute("username", cust1.getEmail());
	        Cart c1=new Cart();
	        ArrayList<Product> selectedList = c1.getList();
	        session.setAttribute("listProduct", selectedList);
	        String username = (String) session.getAttribute("username");
	        ArrayList<Product> updatedlist = (ArrayList<Product>) session.getAttribute("listProduct");
	    }
	

}

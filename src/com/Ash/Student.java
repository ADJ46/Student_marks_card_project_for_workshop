package com.Ash;



import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Student extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		try{
		 int phy=Integer.parseInt(req.getParameter("phy"));
		 int chem=Integer.parseInt(req.getParameter("chem"));
		 int maths=Integer.parseInt(req.getParameter("maths"));
		 double total=phy+chem+maths;
		 double result=(phy+chem+maths)/3;
		 res.getWriter().println("<table border=2>"
					+ "<tr>"
					+ "<th>PHYSICS</th>"
					+ "<th>CHEMISTRY</th>"
					+ "<th>MATHS</th>"
					+ "<th>GRAND TOTAL</th>"
					+ "<th>GRADE</th"
					+ "></tr>"
					+ "<tr>"
					+ "<td>"+phy+"</td>"
					+"<td>"+chem+"</th>"
					+"<td>"+maths+"</td>");
			if(result<=100&&result>=80)
				res.getWriter().println("<td>"+total+"</td>"+"<td>A</td>");
			else if(result<80&&result>=50)
				res.getWriter().println("<td>"+total+"</td>"+"<td>B</td>");
			else
				res.getWriter().println("<td>"+total+"</td>"+"<td>C</td>");
		res.getWriter().println( "</tr>"+ "</table>");
		}
		
		
		catch(Exception e)
		{
			res.getWriter().println("<h1>Enter Valid Marks!!!</h1>");
		}
	}
}
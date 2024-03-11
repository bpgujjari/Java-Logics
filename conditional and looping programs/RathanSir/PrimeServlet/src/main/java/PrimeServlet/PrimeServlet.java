package PrimeServlet;

import java.io.IOException;
import java.io.PrintWriter;  

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  public PrimeServlet() {
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		int start=Integer.parseInt(request.getParameter("start"));
		int end=Integer.parseInt(request.getParameter("end"));
		
		for(int i=start;i<=end;i++)
		{	int n=i;
			boolean isPrime=true;
			for(int j=2;j<n;j++)
			{
				if(n%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
				writer.println(n+"--is  a prime number");
				writer.println();
		}
}
}

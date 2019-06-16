package servletjeden;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jamnik")
public class HelloWorldServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			ArrayList<Integer> dzielniki = new ArrayList<Integer>();
			String p = request.getParameter("liczba");
			int result = Integer.parseInt(p);
			for(int i = 1; i <= result; i++)
			{
				if(result % i == 0)
				{
					dzielniki.add(i);					
				}
			}
			request.setAttribute("dzielniki", dzielniki);
			try {
				request.getRequestDispatcher("/WEB-INF/Odpowiedz.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	


}
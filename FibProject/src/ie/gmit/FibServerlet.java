package ie.gmit;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;

public class FibServerlet extends HttpServlet { 

	private static final long serialVersionUID = 1L;

	FibServer fibserver=new FibServer();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String value;

		RemoteFibonacci fibonacci=new FibonacciImpl(1099);
		LocateRegistry.createRegistry(1099);
		Naming.rebind("fibo",fibonacci);

		// reading the user input
		int max= Integer.parseInt(request.getParameter("max"));
		int jobNum=fibserver.add(max);
		String type=request.getParameter("request-type");
		//int job = fib.getJobNum();

		if(type.equals("add")){

			try {
				RemoteFibonacci remotefibonacci=(RemoteFibonacci)Naming.lookup("rmi://localhost:1099/fibo");
				String result=remotefibonacci.fibonacciMethod(max);
				fibserver.put(jobNum, result);
				System.out.println(result);

				request.setAttribute("result",result);
				request.getRequestDispatcher("Result.jsp").forward(request,response);
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}




	}




	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req,resp);
	}  


}

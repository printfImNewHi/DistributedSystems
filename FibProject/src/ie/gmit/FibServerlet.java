package ie.gmit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import  com.sun.org.apache.xml.internal.security.Init;
public class FibServerlet extends HttpServlet { 

	private static final long serialVersionUID = 1L;
	FibServer fibServe;
	int jobNum;

	public void  init(){
		fibServe = new FibServer();
		System.out.println("Creating Registry!!!!");
		try {
			RemoteFibonacci fibonacci = new FibonacciImpl(1099);
			LocateRegistry.createRegistry(1099);
			Naming.rebind("fibo",fibonacci);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String type = request.getParameter("Input");

		if(type.equals("add")){
			System.out.println("LookUp and Adding to the Queue");
			int max = Integer.parseInt(request.getParameter("max"));
			int jobNum = fibServe.add(max);
			try {
				RemoteFibonacci remotefibonacci=(RemoteFibonacci)Naming.lookup("rmi://localhost:1099/fibo");
				String result = remotefibonacci.fibonacciMethod(max);
				fibServe.put(jobNum, result);
				System.out.println("The Job Number is " + jobNum);
				System.out.println("The Fibonacci is " + result);
				request.setAttribute("jobnum",jobNum);
				request.setAttribute("result",result);
				request.getRequestDispatcher("Second.jsp").forward(request,response);
			} catch (NotBoundException e) {
				// TODO Auto-generated catch block
				System.out.println("RMI problem");
				e.printStackTrace();
			}

		}else if(type.equals("poll")){
			System.out.println("Polling for Result Page");
			String returnType = request.getParameter("jobNum");
			if(returnType!=null){
				response.sendRedirect("Result.jsp?result=" + returnType);
			}else{
		
				response.sendRedirect("Second.jsp");
		
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

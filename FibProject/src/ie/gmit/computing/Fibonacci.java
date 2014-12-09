package ie.gmit.computing;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Fibonacci extends UnicastRemoteObject implements RemoteFibonacci{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Fibonacci() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String fibonacciMethod(int max) throws RemoteException{
		switch(max){
		case 0:
			return "1";
			
		case 1:
			return "1, 1";
			default:
				BigInteger f1 = BigInteger.ONE;
				BigInteger f2 = BigInteger.ONE;
				BigInteger fib = BigInteger.ZERO;
				StringBuffer bf = new StringBuffer("1, 1, ");
				for (int i = 0; i < max; i++) {
					fib = f1.add(f2);
					bf.append(fib).append(", ");
					f1 = f2;
					f2 = fib;
				}
				return bf.toString();	
			}
	}
}

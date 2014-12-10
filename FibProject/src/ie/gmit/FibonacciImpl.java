package ie.gmit;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FibonacciImpl extends UnicastRemoteObject implements RemoteFibonacci{


	private static final long serialVersionUID = 1L;
	private RemoteFibonacci remote;

	protected FibonacciImpl(int port) throws RemoteException {
		super(port);
		// TODO Auto-generated constructor stub
	}
	
	public FibonacciImpl(RemoteFibonacci remote) throws RemoteException {
		super();
		this.remote = remote;
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

	public RemoteFibonacci getRemote() {
		return remote;
	}

}

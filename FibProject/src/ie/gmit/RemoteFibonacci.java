package ie.gmit;

import java.rmi.Remote;
import java.rmi.RemoteException;
//Remote Interface
public interface RemoteFibonacci extends Remote{
	public String fibonacciMethod(int max) throws RemoteException;
		
}
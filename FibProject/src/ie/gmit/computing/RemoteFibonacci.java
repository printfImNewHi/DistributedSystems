package ie.gmit.computing;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteFibonacci extends Remote{
	public String fibonacciMethod(int max) throws RemoteException;
		
}
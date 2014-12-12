package ie.gmit;

import java.util.*;


public class FibServer {
	//List to hold Request objects & Map to hold Job Number and Result
	private LinkedList<FibRequest> inqueue = new LinkedList<FibRequest>();
	private Map<Integer , String> outqueue = new HashMap<Integer , String>();
	//get random number add it to list 
	public int add(int max){
		int random = (int)(Math.random() * max + System.currentTimeMillis());
		inqueue.add(new FibRequest(random, max));
		return random;
	}
	//Remove from map using Job number as key
	public String getResult(int jobNum){
		if (outqueue.containsKey(jobNum)) {
			String result = outqueue.get(jobNum);
			outqueue.remove(jobNum);
			return result;
		}
		else{
			return null;
		}
	}
	//Put into Map
	public void put(int jobNum,String fibNum){
		outqueue.put(jobNum, fibNum);
	}
}

package ie.gmit;

import java.util.*;


public class FibServer {
	Timer myTimer;
	
	private LinkedList<FibRequest> inqueue = new LinkedList<FibRequest>();
	
	private Map<Integer , String> outqueue = new HashMap<Integer , String>();
	
	public int add(int max){
		int random = (int)(Math.random() * max + System.currentTimeMillis());
		inqueue.add(new FibRequest(random, max));
		return random;
		
	}
	
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

}

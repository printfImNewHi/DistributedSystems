package gmit;

import java.util.*;

public class Course {
	private String courseName;
	private List<Moduales> mod = new ArrayList<Moduales>();
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	//delagate method
	public void addMod(Moduales m){
		this.addMod(m);
		
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println(this.toString() + " course is about to be GC'ed");
	}




}
 
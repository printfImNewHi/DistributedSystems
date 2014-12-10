package gmit;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.runFinalizersOnExit(true);
		
		Course course = new Course("software");
		Address address = new Address("MainStreet", "castlebar");
		//course.addMod(new Moduales());
	
		Student s = new Student("asdfasd", 12, address, course, new BlackDiamondDate(System.currentTimeMillis()));
		System.out.println(s.getName().toString()); 
		
		
		
			
		
		
		
		

	}

}

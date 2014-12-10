package gmit;

public class Student {
	private String id;
	private int age;
	private Address address;
	private Course course;
	private BlackDiamondDate dobDate;

	public String getName() {
		return id;
	}

	public void setName(String name) {
		this.id = name;
	}

	public Student(String id, int age, Address address, Course course,
			BlackDiamondDate dobDate) {
		super();
		this.id = id;
		this.age = age;
		this.address = address;
		this.course = course;
		this.dobDate = dobDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println(this.id + " is about to be finalized");
		
	}
	
	
	
	
	

}

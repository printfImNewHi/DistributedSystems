package gmit;

public class Address {
	
	private String street;
	private String city;
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println(this + " address is about to be GC'ed");
	}
	
	
	

}

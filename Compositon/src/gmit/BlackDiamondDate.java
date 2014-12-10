package gmit;

import java.util.Date;

public class BlackDiamondDate extends Date{

	public BlackDiamondDate(long date) {
		super(date);
		// TODO Auto-generated constructor stub
	}

	public BlackDiamondDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println(this.toString() + " BlackDiamondDate is about to be GC'ed");
	}
	
	
	
	
    

}

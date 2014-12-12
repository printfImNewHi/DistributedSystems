package ie.gmit;

import java.io.Serializable;

public class FibRequest implements Serializable{
	//Create Request Object that Serializable
	private static final long serialVersionUID = 1L;
	//
	private int jobNum;
	private int max;
	
	public int getJobNum() {
		return jobNum;
	}

	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public FibRequest(int jobNum, int max) {
		super();
		this.jobNum = jobNum;
		this.max = max;
	}
	

}

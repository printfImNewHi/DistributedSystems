package ie.gmit.computing;

public class FibRequest {
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

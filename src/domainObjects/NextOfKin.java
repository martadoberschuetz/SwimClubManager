package domainObjects;

public class NextOfKin {

	private String nextOfKinName;
	private int nextOfKinPhoneNumber;
	
	public NextOfKin(
			String nextOfKinName,
			int nextOfKinPhoneNumber){
		
		this.nextOfKinName = nextOfKinName;
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
	}
	
	public String getNextOfKinName() {
		return nextOfKinName;
	}
	public void setNextOfKinName(String nextOfKinName) {
		this.nextOfKinName = nextOfKinName;
	}
	public int getNextOfKinPhoneNumber() {
		return nextOfKinPhoneNumber;
	}
	public void setNextOfKinPhoneNumber(int nextOfKinPhoneNumber) {
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
	}

	@Override
	public String toString() {
		return "NextOfKin [nextOfKinName=" + nextOfKinName
				+ ", nextOfKinPhoneNumber=" + nextOfKinPhoneNumber + "]";
	}
}
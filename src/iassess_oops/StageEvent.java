package iassess_oops;

public class StageEvent extends Event{
	int noOfSeats;
	public StageEvent(String name, String detail, String type, String ownerDate, Double costPerDay,int noOfSeats) {
		super(name,detail,type,ownerDate,costPerDay);
		this.noOfSeats=noOfSeats;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
}

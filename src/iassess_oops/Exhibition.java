package iassess_oops;

public class Exhibition extends Event {
	int noOfStall;
public Exhibition(String name, String detail, String type, String ownerDate, Double costPerDay,int noOfStall) {
	super(name,detail,type,ownerDate,costPerDay);
	this.noOfStall=noOfStall;
}
public int getNoOfStall() {
	return noOfStall;
}
public void setNoOfStall(int noOfStall) {
	this.noOfStall = noOfStall;
}

}

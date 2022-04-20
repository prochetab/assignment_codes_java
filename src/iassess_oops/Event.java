package iassess_oops;

public class Event {
	String name;
	String detail;
	String type;
	String ownerDate;
	Double costPerDay;
	public Event(String name, String detail, String type, String ownerDate, Double costPerDay)
	{
		this.name=name;
		this.detail=detail;
		this.type=type;
		this.ownerDate=ownerDate;
		this.costPerDay=costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerDate() {
		return ownerDate;
	}
	public void setOwnerDate(String ownerDate) {
		this.ownerDate = ownerDate;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
}

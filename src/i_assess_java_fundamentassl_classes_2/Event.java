package i_assess_java_fundamentassl_classes_2;
import java.util.*;
public class Event {
	private String eventName;
	private Date startDate;
	private Date endDate;
	public Event(String eventName, Date startDate, Date endDate)
	{
		this.eventName=eventName;
		this.startDate=startDate;
		this.endDate=endDate;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}

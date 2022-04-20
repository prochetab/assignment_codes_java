package i_assess_java_fundamentassl_classes_2;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Events");
		int n=sc.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
		String[] events=new String[n+1];
		int j=0;
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String input=sc.nextLine();
			System.out.println(input);
			String[] eventList=input.split(",");
			try {
				Event eventObj=new Event(eventList[0],sdf.parse(eventList[1]),sdf.parse(eventList[2]));
				if(eventObj.getStartDate().equals(eventObj.getEndDate()))
				{
					events[j]=eventObj.getEventName();
					j++;
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("1-day Events:");
		if(j!=0)
		{
		    for(String eventname:events)
		    {
		    	if(eventname!=null)
		    	{
		    		System.out.println(eventname);
		    	}
		    	
		    }
		}
		else
		{
			System.out.println("No Events");
		}
	}

}

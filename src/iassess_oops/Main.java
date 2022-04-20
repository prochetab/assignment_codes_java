package iassess_oops;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		System.out.println("1.Exhibition event");
		System.out.println("2.Stage event");
		int choice=sc.nextInt();
		Double price;
		Double gst;
		if(choice==1)
		{
			sc.nextLine();
			System.out.println("Enter the details of exhibition:");
			String input1=sc.nextLine();
			String[] inputArray1=input1.split(",");
			Exhibition exhibition=new Exhibition(inputArray1[0], inputArray1[1], inputArray1[2], inputArray1[3], Double.parseDouble(inputArray1[4]),Integer.parseInt(inputArray1[5]));
			price=exhibition.getCostPerDay();
			gst=0.05;
		}
		else
		{
			sc.nextLine();
			System.out.println("Enter the details of stage event:");
			String input2=sc.nextLine();
			String[] inputArray2=input2.split(",");
			StageEvent stage=new StageEvent(inputArray2[0], inputArray2[1], inputArray2[2], inputArray2[3], Double.parseDouble(inputArray2[4]),Integer.parseInt(inputArray2[5]));
		    price=stage.getCostPerDay();
		    gst=0.15;
		}
		System.out.println("Enter the starting date of the event:");
		String startDate=sc.next();
		System.out.println("Enter the ending date of the event:");
		String endDate=sc.next();
		float days;
		
		
		try {
			SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date dateBefore = myFormat.parse(startDate);
			Date dateAfter = myFormat.parse(endDate);
			long difference = dateAfter.getTime() - dateBefore.getTime();
		    days = (difference / (1000*60*60*24));
		    double totalBill=days*price;
			double gstAmount=totalBill*gst;
			System.out.println("The GST to be paid is Rs."+gstAmount);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
		
//		String[] startDateArray=startDate.split("-");
//		String[] endDateArray=endDate.split("-");
//		int days=Integer.parseInt(endDateArray[0])-Integer.parseInt(startDateArray[0]);
		
	}

}

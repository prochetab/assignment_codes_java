package i_design_java_3_fundamental_classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
		String inputDate=sc.next();
		 SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM d, yy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
        Date d1=null;
        try
        {
        	d1=sdf.parse(inputDate);
        }
        catch(ParseException e)
        {
        	e.printStackTrace();
        }
        
        System.out.println("Date Format with EEE, MMM d, yy :"+sdf1.format(d1));
        System.out.println("Date Format with dd.MM.yyyy :"+sdf2.format(d1));
        System.out.println("Date Format with dd dd/MM/yyyy :"+sdf3.format(d1));

	}

}

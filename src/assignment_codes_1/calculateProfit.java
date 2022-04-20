package assignment_codes_1;
import java.util.*;
public class calculateProfit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float res=calculateProfit(n);
		System.out.println(res);
	}
public static float calculateProfit(int numAttendees)
{
	float sell=5*numAttendees;
	float costTheatre=(float)(20+(0.5*numAttendees));
	return sell-costTheatre;
}
}

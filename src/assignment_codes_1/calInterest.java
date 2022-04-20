package assignment_codes_1;
import java.util.*;
public class calInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		double res=calInterest(principal);
		System.out.println(res);
	}
	public static double calInterest(int amt) 
	{
		double interestRate;
		if(amt<=1000)
		{
			interestRate=4;
		}
		else if(amt<=5000)
		{
			interestRate=4.5;
		}
		else
		{
			interestRate=5;
		}
		double interest=(amt*interestRate)/100;
		return interest;
	}
}

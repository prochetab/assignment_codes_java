package assignment_codes_1;
import java.util.*;
public class calTax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		double result=calTax(principal);
		System.out.println(result);
	}
	public static double calTax(int gp)
	{
		double interestRate;
		if(gp<=240)
		{
			interestRate=0;
		}
		else if(gp>240 && gp<=480)
		{
			interestRate=15;
		}
		else
		{
			interestRate=28;
		}
		double tax=(gp*interestRate)/100;
		return tax;
	}

}

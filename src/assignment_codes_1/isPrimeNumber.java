package assignment_codes_1;
import java.util.*;
public class isPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=isPrimeNumber(n);
		System.out.println(res);
	}
public static boolean isPrimeNumber(int num)
{
	for(int i=2;i*i<num;i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
	return true;
}
}

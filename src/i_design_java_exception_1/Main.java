package i_design_java_exception_1;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Boolean[] seatArray= new Boolean[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of seats to be booked:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		Boolean status=false;
		if(n>100 || n==0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i=0;i<seatArray.length;i++)
		{
			int j=i+1;
			System.out.println("Enter the seat number "+j);
			int order=sc.nextInt();
			try
			{
				seatArray[order]=true;
				arr[i]=order;
				status=false;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				status=true;
				System.out.println("java.lang.ArrayIndexOutOfBoundsException: 100");
				break;
			}
		}
		if(status==false)
		{
			System.out.println("The seats booked are:");
			for(int val:arr)
			{
				System.out.println(val);
			}
		}
		
//		if(arr.length==n)
//		{
//			System.out.println("The seats booked are:");
//		}
	}
}

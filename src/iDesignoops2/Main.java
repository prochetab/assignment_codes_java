package iDesignoops2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		int x=sc.nextInt();
		
		if(x==1)
		{
			sc.nextLine();
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String s=sc.nextLine();
			String[] inputArray=s.split(",");
			System.out.println(inputArray[3]);;
			SavingsAccount sAccount= new SavingsAccount(inputArray[0],inputArray[1],inputArray[2],inputArray[3]);
			sAccount.display();
		}
		else
		{
			sc.nextLine();
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			String s=sc.nextLine();
			String[] inputArray=s.split(",");
			CurrentAccount cAccount= new CurrentAccount(inputArray[0],inputArray[1],inputArray[2],inputArray[3]);
			cAccount.display();
		}
	}

}

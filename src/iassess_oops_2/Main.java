package iassess_oops_2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Stall Type");
		System.out.println("1)Gold Stall");
		System.out.println("2)Premium Stall");
		System.out.println("3)Executive Stall");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			sc.nextLine();
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			String input1=sc.nextLine();
			String[] inputArray1=input1.split(",");
			GoldStall gdstall=new GoldStall(inputArray1[0], Integer.parseInt(inputArray1[1]), inputArray1[2], Integer.parseInt(inputArray1[3]));
			gdstall.display();
		}
		else if(choice==2)
		{
			sc.nextLine();
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
			String input1=sc.nextLine();
			String[] inputArray1=input1.split(",");
			PremiumStall prstall=new PremiumStall(inputArray1[0], Integer.parseInt(inputArray1[1]), inputArray1[2], Integer.parseInt(inputArray1[3]));
			prstall.display();
		}
		else if(choice==3)
		{
			sc.nextLine();
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
			String input1=sc.nextLine();
			String[] inputArray1=input1.split(",");
			ExecutiveStall exestall= new ExecutiveStall(inputArray1[0], Integer.parseInt(inputArray1[1]), inputArray1[2], Integer.parseInt(inputArray1[3]));
			exestall.display();
		}
		else
		{
			System.out.println("Invalid Stall Type");
		}
	}

}

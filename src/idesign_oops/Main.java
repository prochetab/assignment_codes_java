package idesign_oops;
import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your account number:");
		String acc=sc.next();
		System.out.println("Enter the balance of the account:");
		Double arg_balance=sc.nextDouble();
		System.out.println("Enter the type of transfer to be made:");
		System.out.println("1.NEFT");
		System.out.println("2.IMPS");
		System.out.println("3.RTGS");
		int choice=sc.nextInt();
		System.out.println("Enter the amount to be transferred:");
		Double transfer=sc.nextDouble();
		if(choice==1)
		{
			NEFTTransfer nftTrasnfer=new NEFTTransfer(acc, arg_balance);
//			System.out.println(nftTrasnfer.getAccountNumber());
			Boolean valueTrue=nftTrasnfer.validate(transfer);
			if(valueTrue==false)
			{
				System.out.println("Account number or transfer amount seems to be wrong");
			}
			else
			{
				if(nftTrasnfer.transfer(transfer)==true)
				{
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+nftTrasnfer.getBalance());
				}
				else
				{
					System.out.println("Transfer could not be made");
				}
			}
		}
		else if(choice==2)
		{
			IMPSTransfer impsTrasnfer=new IMPSTransfer(acc, arg_balance);
			if(impsTrasnfer.validate(transfer)==false)
			{
				System.out.println("Account number or transfer amount seems to be wrong");
			}
			else
			{
				if(impsTrasnfer.transfer(transfer)==true)
				{
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+impsTrasnfer.getBalance());
				}
				else
				{
					System.out.println("Transfer could not be made");
				}
			}
		}
		else
		{
			RTGSTransfer rtgsTrasnfer=new RTGSTransfer(acc, arg_balance);
			if(rtgsTrasnfer.validate(transfer)==false)
			{
				System.out.println("Account number or transfer amount seems to be wrong");
			}
			else
			{
				if(rtgsTrasnfer.transfer(transfer)==true)
				{
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is "+rtgsTrasnfer.getBalance());
				}
				else
				{
					System.out.println("Transfer could not be made");
				}
			}
		}
	}

}

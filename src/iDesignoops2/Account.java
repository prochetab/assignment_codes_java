package iDesignoops2;

public class Account {
	protected String accName;
	protected String accNo;
	protected String bankName;
	
	public void display()
	{
		System.out.println("Account Name:"+accName);
		System.out.println("Account Number:"+accNo);
		System.out.println("Bank Name:"+bankName);
	}
}

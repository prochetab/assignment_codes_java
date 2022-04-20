package iDesignoops2;

public class CurrentAccount extends Account{
	private String tinNumber;
	public CurrentAccount(String accName,String accNo,String bankName,String tinNumber)
	{
		this.tinNumber=tinNumber;
		super.accName=accName;
		super.accNo=accNo;
		super.bankName=bankName;
		
	}
	public void display()
	{
		super.display();
		System.out.println("TIN Number:"+this.tinNumber);
	}
}

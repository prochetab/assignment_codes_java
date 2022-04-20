package iDesignoops2;

public class SavingsAccount extends Account{
	private String orgName;
	SavingsAccount(String accName,String accNo,String bankName,String orgName)
	{
		super.accName=accName;
		super.accNo=accNo;
		super.bankName=bankName;
		this.orgName=orgName;
	}
	public void display()
	{
		super.display();
		System.out.println("Organisation Name:"+this.orgName);
	}
}

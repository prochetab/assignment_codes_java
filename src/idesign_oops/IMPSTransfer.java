package idesign_oops;

public class IMPSTransfer extends FundTransfer {
	
public IMPSTransfer(String accountNumber, Double balance) {
	super(accountNumber,balance);
}

@Override
public Boolean transfer(Double transfer)
{
	double amount=transfer+0.02*transfer;
	double balanceObtained=super.getBalance();
	if(amount<balanceObtained)
	{
		super.setBalance(balanceObtained-amount);
		return true;
	}
	return false;
}
}
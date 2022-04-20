package idesign_oops;

public class NEFTTransfer extends FundTransfer {
	
public NEFTTransfer(String accountNumber, Double balance) {
	super(accountNumber,balance);
}

@Override
public Boolean transfer(Double transfer)
{
	double amount=transfer+0.05*transfer;
	double balanceObtained=super.getBalance();
	if(amount<balanceObtained)
	{
		super.setBalance(balanceObtained-amount);
		return true;
	}
	return false;
}
}

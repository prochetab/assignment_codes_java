package idesign_oops;

public class RTGSTransfer extends FundTransfer {
	
public RTGSTransfer(String accountNumber, Double balance) {
	super(accountNumber,balance);
}

@Override
public Boolean transfer(Double transfer)
{
	
	double balanceObtained=super.getBalance();
	if(transfer>10000)
	{
		super.setBalance(balanceObtained-transfer);
		return true;
	}
	return false;
}
}
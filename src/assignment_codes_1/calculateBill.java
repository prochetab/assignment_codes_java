package assignment_codes_1;

public class calculateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateBill("domestic",50));

	}
public static double calculateBill( String connectionType, int consumedUnits)
{
	if(connectionType=="domestic")
	{
		if(consumedUnits<=100)
		{
			return 4*consumedUnits;
		}
		else if(consumedUnits>100 && consumedUnits<=300)
		{
			return 4.50*consumedUnits;
		}
		else if(consumedUnits>300 && consumedUnits<=500)
		{
			return 4.75*consumedUnits;
		}
		else
		{
			return 5*consumedUnits;
		}
	}
	else
	{
		if(consumedUnits<=100)
		{
			return 4.25*consumedUnits;
		}
		else if(consumedUnits>100 && consumedUnits<=300)
		{
			return 4.75*consumedUnits;
		}
		else if(consumedUnits>300 && consumedUnits<=500)
		{
			return 5*consumedUnits;
		}
		else
		{
			return 5.25*consumedUnits;
		}
	}
}
}

package Medicine;
import java.util.*;
public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine[] medicineArray=new Medicine[10];
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String address=sc.nextLine();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int choice=r.nextInt(2) + 1;
			System.out.println(choice);
			switch(choice)
			{
			case 1:
				Tablet tablet=new Tablet(name,address);
				tablet.displayLabel();
				medicineArray[i]=tablet;
				break;
			case 2:
				 Syrup syrup=new Syrup(name,address);
				 syrup.displayLabel();
				 medicineArray[i]=syrup;
				 break;
			case 3:
				Ointment ointment=new Ointment(name, address);
				ointment.displayLabel();
				medicineArray[i]=ointment;
				break;
			}
		}
	}

}

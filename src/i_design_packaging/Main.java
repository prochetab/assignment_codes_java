package i_design_packaging;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the country name");
		String cname=sc.next();
		System.out.println("Enter the country code");
		String ccode=sc.next();
        System.out.println("Enter the isd code");
        String isdcode=sc.next();
        Country country=new Country(cname,ccode,isdcode);
        country.getOutput();
	}

}

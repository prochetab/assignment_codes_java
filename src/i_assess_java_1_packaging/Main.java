package i_assess_java_1_packaging;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Address");
		System.out.println("Enter the street");
		String street=sc.nextLine();
		System.out.println("Enter the city");
		String city=sc.next();
        System.out.println("Enter the pincode");
        int pin=sc.nextInt();
        System.out.println("Enter the country");
        String country=sc.next();
        Address address=new Address(street,city,pin,country);
        address.displayAddress();

	}

}

package iDesignoops;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the staff:");
		String name=sc.nextLine();
		String designation;
		System.out.println("Enter the staff designation:");
		designation=sc.nextLine();
		System.out.println("Enter the department name:");
		String department=sc.nextLine();
		Staff staff=new Staff(name,designation);
		Department d1=new Department(staff,department);
		d1.displayStaff();
		
	}

}

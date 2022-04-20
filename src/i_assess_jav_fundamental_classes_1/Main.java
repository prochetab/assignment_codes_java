package i_assess_jav_fundamental_classes_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,String> locationMap=new HashMap<String, String>();
		locationMap.put("DH", "DEL");
		locationMap.put("MB", "MUB");
		locationMap.put("KL", "KOL");
		
		
		System.out.println("Enter the code");
		String inputCode=sc.next();
		
		
		StringBuilder input=new StringBuilder(inputCode);
		

		input.replace(0, 2, locationMap.get(input.substring(0,2)));

		input.replace(3, input.length(), String.format("%05d",Integer.parseInt(inputCode.substring(2))));
		System.out.println("Formatted code");
        System.out.println(input);
	}
}
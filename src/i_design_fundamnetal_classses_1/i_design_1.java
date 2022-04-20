package i_design_fundamnetal_classses_1;
import java.util.*;
public class i_design_1 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter the text from the document");
     String input=sc.nextLine();
     System.out.println("Enter the string to be found in the data");
     String word=sc.nextLine();
     String wordMod=word.trim();
     System.out.println(wordMod);
     if(input.contains(wordMod))
     {
    	 System.out.println("String is found in the document");
     }
     else
     {
    	 System.out.println("String is not found in the document");
     }
}
}

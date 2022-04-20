package assignment_codes_1;
import java.util.*;
public class checkAlpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char x=sc.next().charAt(0);
		boolean res=checkAlpha(x);
		System.out.println(res);
	}
	public static boolean checkAlpha(char alph)
	{
		char[] alphaArray= {'a','e','i','o','u','A','E','I','O','U'};
		for(char character:alphaArray)
		{
			if(alph==character)
			{
				return true;
			}
		}
		return false;
	}
}

package assignment_codes_1;

import java.util.*;

public class printPrime {

	public static void main(String[] args) {
		printPrime(5);
	}
   public static void printPrime(int maxVal)
   {
	   Vector<Boolean> primeArray = new Vector<Boolean>();
		for(int k=0;k<=maxVal;k++)
		{
			primeArray.add(true);
		}
		primeArray.set(0, false);
		primeArray.set(1,false);
		System.out.println(primeArray);
		for(int i=2;i*i<=maxVal;i++)
		{
			for(int j=2*i;j<=maxVal;j=j+i)
			{
				primeArray.set(j,false);
			}
		}
		for(int k=2;k<primeArray.size();k++)
		{
			if(primeArray.get(k)==true)
			{
				System.out.println(k);
			}
		}
   }
}

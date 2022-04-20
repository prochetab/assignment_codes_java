package assignment_codes_1;
import java.util.*;
public class calMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int res=calMax(x,y,z);
		System.out.println(res);
	}
	public static int calMax(int x,int y,int z)
	{
		return (x>y)?(x>z?x:z):(y>z?y:z);
	}

}

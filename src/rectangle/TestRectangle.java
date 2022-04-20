package rectangle;
import java.util.*;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input three lengths");
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		int l3=sc.nextInt();
		System.out.println("input 3 breadths");
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int b3=sc.nextInt();
		rectangle r1=new rectangle(l1,b1);
		rectangle r2=new rectangle(l2,b2);
		rectangle r3=new rectangle(l3,b3);
		System.out.println("The area of firsat rectangle is "+r1.area());
		System.out.println("The area of second rectangle is"+r2.area());
		System.out.println("The area of third rectangle is"+r3.area());
	}

}

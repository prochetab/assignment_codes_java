package book;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input n");
		int n=sc.nextInt();
		BookManager bmanager=new BookManager(n);
		bmanager.showBooks();
	}

}

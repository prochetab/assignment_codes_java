package Medicine;
import java.util.*;
public class Tablet extends Medicine {

	
	public Tablet(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println("Name: "+super.getName());
		System.out.println("Address: "+super.getAddress());
		System.out.println("store in a cool dry place");
	}
	
}

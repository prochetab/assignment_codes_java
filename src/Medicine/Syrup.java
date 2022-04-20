package Medicine;

public class Syrup extends Medicine{

	public Syrup(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println("Name: "+super.getName());
		System.out.println("Address: "+super.getAddress());
		System.out.println("acc to prescription");
		
	}

}

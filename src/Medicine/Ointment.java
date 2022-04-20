package Medicine;

public class Ointment extends Medicine{

	public Ointment(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		System.out.println("Name: "+super.getName());
		System.out.println("Address: "+super.getAddress());
		System.out.println("for external use only");
		
	}

}

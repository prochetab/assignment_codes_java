package Medicine;

abstract public class Medicine {
	private String name;
	private String address;
	public Medicine(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	abstract public void displayLabel();
}

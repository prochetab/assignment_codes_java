package iassess_oops_2;

public class ExecutiveStall implements Stall{
	private String stallName;
	private int cost;
	private String ownerName;
	private int screen;
	public ExecutiveStall() {
		// TODO Auto-generated constructor stub
	}
	public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen)
	{
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.screen=screen;
	}
	
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name:"+stallName);
		System.out.println("Cost:"+cost+".Rs");
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Number of Screens:"+screen);
	}
}

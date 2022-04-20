package iassess_oops_2;

public class PremiumStall implements Stall{
	private String stallName;
	private int cost;
	private String ownerName;
	private int projector;
	public PremiumStall() {
		// TODO Auto-generated constructor stub
	}
	public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector)
	{
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.projector=projector;
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
	
	
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name:"+stallName);
		System.out.println("Cost:"+cost+".Rs");
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Number of Projectors:"+projector);
	}
}

package iassess_oops_2;

public class GoldStall implements Stall {
	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;
	public GoldStall() {
		// TODO Auto-generated constructor stub
	}
	public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet)
	{
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.tvSet=tvSet;
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
	public int getTvSet() {
		return tvSet;
	}
	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name:"+stallName);
		System.out.println("Cost:"+cost+".Rs");
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Number of TV sets:"+tvSet);
	}

}

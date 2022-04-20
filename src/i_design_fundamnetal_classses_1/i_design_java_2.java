package i_design_fundamnetal_classses_1;
import java.util.*;
public class i_design_java_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items:");
		int n=sc.nextInt();
		System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
		String[] arr = new String[n];
		for(int i=0;i<n;i++)
		{
			String input1=sc.next();
			String[] inputArray1=input1.split("\\$");
			System.out.println(inputArray1[0]);
			Item item=new Item(inputArray1[0],inputArray1[1],Integer.parseInt(inputArray1[2]),Integer.parseInt(inputArray1[3]));
			String arrayElement=item.getName()+","+item.getType()+","+item.getCost()+","+item.getAvailability();
			arr[i]=arrayElement;

			
		}
		for(String el:arr)
		{
			System.out.println(el);
		}
	}

}

class Item
{
	private String name;
	private String type;
	private int cost;
	private int availableQuanity;
	public Item(String name, String type, int cost,int availableQuanity)
	{
		this.name=name;
		this.type=type;
		this.cost=cost;
		this.availableQuanity=availableQuanity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAvailableQuanity() {
		return availableQuanity;
	}
	public void setAvailableQuanity(int availableQuanity) {
		this.availableQuanity = availableQuanity;
	}
	public String getAvailability()
	{
		if(availableQuanity==0)
		{
			return "Available";
		}
		else
		{
			return "Not Available";
		}
	}
}
package rectangle;
import java.util.*;
public class rectangle {
	private int length;
	private int breadth;
	public rectangle()
	{
		length=0;
		breadth=0;
	}
	public rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int area()
	{
		return length* breadth;
	}
	public int getLength()
	{
		return length;
	}
	public int getBreadth()
	{
		return breadth;
	}
}

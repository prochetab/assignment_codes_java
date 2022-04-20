package iDesignoops;

public class Department{
	private String departmentName;
	private Staff staff;
	public Department(Staff st,String arg_departmentName)
	{
		staff=st;
		departmentName=arg_departmentName;
	}
	public void displayStaff()
	{
		System.out.println(staff.getStaffName()+" is working in the "+departmentName+" department as "+staff.getDesignation());
	}
}

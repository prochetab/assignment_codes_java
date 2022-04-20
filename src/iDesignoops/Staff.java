package iDesignoops;

public class Staff {
	private String staffName;
	private String designation;
	public Staff(String arg_staffName, String arg_designation)
	{
		staffName=arg_staffName;
		designation=arg_designation;
	}
	public String getStaffName()
	{
		return staffName;
	}
	public String getDesignation()
	{
		return designation;
	}
}

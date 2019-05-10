public class EmployeeDetails
{
	private String name;
	private String address;
	private int number;
	
	public void  Employee(String name,String address,int number)
	{
		System.out.println("Constrcuting an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public void mailCheck()
	{
		System.out.println("Mailing a check to " +this.name + " " +this.address);
	}
	
	public String toString()
	{
		return name +" "+address + " " + number;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}

	public void setAddress(String newAddresss)
	{
		address = newAddresss;
	}
	public int getNumber()
	{
		return number;
	}
}	
	
public class PolyDemo
{
	public static void main (String args[])
	{
		Salary s= new Salary("Mahaveer", "TVR", 04, 25000.00);
		EmployeeDetails e = new Salary("Veer", "Chennai", 01, 20000.00);
		System.out.println("Call mailCheck using Salary ref  ...");
		s.mailCheck();	
		System.out.println("Call mailCheck using Employee ref ..");
		e.mailCheck();
	}
}
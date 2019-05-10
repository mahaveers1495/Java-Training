public class Encapsulation
{
	public static void main(String args[])
	{
		MyData my = new MyData();
		
		my.setName("Veer");
		my.setAge(23);
		my.setRoll(04);
		
		System.out.println("My Name is : " + my.getName());
		System.out.println("My Age is : " + my.getAge());
		System.out.println("My Roll no is : " + my.getRoll());
	}
}	
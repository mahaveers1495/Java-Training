class Bicycle
{
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}
	public void speedUp(int increment)
	{
		speed += increment;
	}
	
	public String toString()
	{
		return("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
	}
}
class MoutainBike extends Bicycle
{
	public int seatHeight;
	
	public MoutainBike(int gear, int speed,int startHeight)
	{
		super(gear,speed);
		seatHeight = startHeight;
	}
	public void setHeight(int newValue)
	{
		seatHeight =  newValue;
	}
	
	public String toString()
	{
		return(super.toString()+ "\nseat height is " + seatHeight);
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		MoutainBike m = new MoutainBike(4, 70, 30);
		System.out.println(m.toString());
	}
}
	
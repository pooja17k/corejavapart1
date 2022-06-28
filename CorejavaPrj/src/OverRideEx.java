
public class OverRideEx {

	public static void main(String[] args) {
		Sub s=new Sub();
		s.display();
	}

}
class Super
{	
	public void display()
	{
			System.out.println("Hello");
	}
}
class Sub extends Super
{
		
	public void display()
	{
			super.display();
			System.out.println("Hi");
	}
}

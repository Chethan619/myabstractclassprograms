package abstractclassprograms.java;
abstract class Command_prompt //abstract class
{
	abstract void add(); //abstract method
}
public class Windows_Laptops extends Command_prompt //concrete class
{

	void add() 
	{
		System.out.println("The implementation is here");
	}
	public static void main(String[] args) //concrete method
	{
		/* Windows_Laptops w1=new Windows_Laptops();
		w1.add(); */
		new Windows_Laptops().add();
	}
}

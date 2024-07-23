package abstractclassprograms.java;
abstract class NewClassTwo
{
	abstract void add();
	abstract void sub();
}
abstract class NewClassOne extends NewClassTwo
{
	abstract void add1();
	abstract void sub1();
}
public class NewClass extends NewClassOne
{
	void mul()
	{
		
	}
	static void div()
	{
		
	}
	public static void main(String[] args) //concrete method
	{
		new NewClass().add();
		new NewClass().sub();
		new NewClass().add1();
		new NewClass().sub1();
	}
	void add() 
	{
		System.out.println("The implementation is here 1");
	}
	void sub() 
	{
		System.out.println("The implementation is here 2");
	}
	void add1() 
	{
		System.out.println("The implementation is here 3");
	}
	void sub1() 
	{
		System.out.println("The implementation is here 4");
	}
}

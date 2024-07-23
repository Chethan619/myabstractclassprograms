package abstractclassprograms.java;
class OldClass2
{
	static void seven()
	{
		System.out.println("7");
	}
	static void eight()
	{
		System.out.println("8");
	}
}
abstract class OldClass1 extends OldClass2
{
	abstract void three();
	abstract void four();
	static void five()
	{
		System.out.println("5");
	}
	void six()
	{
		System.out.println("6");
	}
}
public class OldClass extends OldClass1
{
	void one()
	{
		System.out.println("1");
	}
	static void two()
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		new OldClass().three();
		new OldClass().four();
		five();
		new OldClass().six();
		seven();
		eight();
		new OldClass().one();
		two();
	}
	void three() 
	{
		System.out.println("3");
	}
	void four() 
	{
		System.out.println("4");
	}
}

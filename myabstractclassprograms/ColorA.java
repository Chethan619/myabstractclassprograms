package abstractclassprograms.java;
interface ColorC
{
	void AnyColor();
}
class ColorB
{
	static void Green()
	{
		System.out.println("Green");
	}
	void Yellow()
	{
		System.out.println("Yellow");
	}
}

public class ColorA extends ColorB implements ColorC
{
     public static void main(String[] args)
     {
    	 ColorA c1=new ColorA();
    	 c1.AnyColor();
    	 c1.Yellow();
    	 Green();
     }

	public void AnyColor() 
	{
		System.out.println("Choose color");
	}
}

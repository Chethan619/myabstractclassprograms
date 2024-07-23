package abstractclassprograms.java;
interface Amazon
{
	void login_with_emailid();
	void login_with_mobileno();
}
public class GroTechMinds implements Amazon
{
public static void main(String[] args)
{
	new GroTechMinds().login_with_emailid();
	new GroTechMinds().login_with_mobileno();
	
}
public void login_with_emailid() 
{
	System.out.println("keep the real logic");
}
public void login_with_mobileno() 
{
	System.out.println("keep the real logic1");
}
}

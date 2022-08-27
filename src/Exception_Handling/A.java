package Exception_Handling;

public class A 
{
	public static void main(String[] args) {
		try 
		{
			System.out.println(10/0);   //Risky code
		}
		catch(NullPointerException Exception)
		{
			System.out.println("enter valid Denomator");
		}
		finally
		{
			System.out.println("Thank you for using ATM");
		}
	}

}

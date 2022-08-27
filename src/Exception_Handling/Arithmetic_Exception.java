package Exception_Handling;

//import Exception.Arithmatic_exp;

public class Arithmetic_Exception 
{
public static void main(String[] args) throws Throwable
{
	int a = 1;
	int b = 0;
	try 
	{
		int c = a/b;        //risky code
	}
	catch (ArithmeticException ref)
	{
		System.out.println("idiot...!Enter valid Denomentor");
	}
	System.out.println("exceptioon is handling");
}
}

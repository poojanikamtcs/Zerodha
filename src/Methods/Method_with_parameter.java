package Methods;

public class Method_with_parameter 
{
public static void main(String[]args)
{
addition(20,30);	          // compile time binding
}
public static void addition(int a, int b)     // formal argument (int a, int b)
{
	int c = a+b;
	System.out.println(c);
}

}

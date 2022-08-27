package Conditional_statement;

public class else_if_ladder 
{
	public static void main(String[] args) 
	{
	int marks = 60;
	if ( marks >= 65)
	{
     System.out.println("Pass with Distinction");
	}
	else if (marks >= 50)
	{
		System.out.println("Pass with 1st class");
	}
	else if (marks >= 40)
	{
		System.out.println("Pass with 2nd class");
	}
	else if (marks >= 35)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
}

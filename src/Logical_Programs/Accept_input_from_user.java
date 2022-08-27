package Logical_Programs;

import java.util.Scanner;

public class Accept_input_from_user
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	
	//it will receive input from user through cansole
	//take 1st number
	
	System.out.println("enter 1st no.");
	int num1 = scan.nextInt();
	
	//take 2nd number
	
	System.out.println("enter 2nd number");
	int num2 = scan.nextInt();
	
	//add two numbers
	System.out.println("addition"+(num1+num2));
}
}

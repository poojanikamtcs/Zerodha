package Logical_Programs;

import java.util.Scanner;

public class replace_multiple_special_character {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the name with special character");
	String name = scan.next();
	String actname =name.replace("[^a-z A-Z]","");
	System.out.println(actname);
}
}

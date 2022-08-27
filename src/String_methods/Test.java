package String_methods;

public class Test 
{
public static void main(String[] args) 
{
	String s1 = "velocity";
	String s2 = "VELOCITY";
	String s3 = "City";
	
	// length() it will give count of characters
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(s3.length());
	
	// to upper case() >> it will convert lower case string into upper case 
	System.out.println(s1.toUpperCase());
	
	// toLowercase() >> it will convert upper case to lowercase
	System.out.println(s2.toLowerCase());
	
	// equals() >> it compare two strings
	System.out.println(s1.equals(s2));
	
	// equalIgnoreCase() >> it wll compare two strings ignoring their cases
	System.out.println(s2.equalsIgnoreCase(s1));
	
	// contains >> it will check  for characters inside to strings
	System.out.println(s1.contains(s3));
	
	// charAt >> it will give character of string at particular positiion (SIOOBE)
	System.out.println(s1.charAt(5));
	
	// indexof() >> it will give index of particular character
	System.out.println(s2.indexOf("Y"));
	
	// lastIndexOf() >> it will give last index of string
	System.out.println(s1.lastIndexOf('t'));
	
	// startwith() >> it will check our string is start with particular character
	System.out.println(s1.startsWith("vy"));
	
	//endsWith() >> it will check our string is ends with particlar character
	System.out.println(s1.endsWith("ty"));
	
	//substring() >> it  will break the string & display
	System.out.println(s1.substring(4));
	
	//concat() >> it will join two strings 
	System.out.println(s1.concat(s2));
	
	//replace() >> it will replace the collection of characters
	System.out.println(s1.replace("city", "Rural"));
}
}

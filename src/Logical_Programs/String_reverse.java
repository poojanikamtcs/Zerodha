package Logical_Programs;

public class String_reverse 
{
	public static void main(String[] args)
	{
	String org = "Pooja";
	String rev = " ";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	}
}


package Arrays;

public class B 
{
public static void main(String[] args) {
	String [] ar = new String [5];    // syntax is not proper
	ar[0] = "Anand";
	ar[1] = "Bablu";
	ar[2] = "Chanda";
	ar[3] = "Dhanush";
	ar[4] = "Ishwar";
	//System.out.print(ar[3]);
	// print all stupid people
	for (int i=0;i<=4;i++)
	{
		System.out.println(ar[i]);
	}
}
}
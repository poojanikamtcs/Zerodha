package Star_Pattern;

public class Verticle_Star_Pattern 
{
public static void main(String[] args) 
{
for (int i=1;i<=5;i++)
{
	for(int j=1;j<=5;j++)
	{
		if (i==j)
		{
			System.out.println("*");
		}
	}
}
System.out.println();
}
}

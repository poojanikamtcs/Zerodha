package Logical_Programs;

public class Palindrome_No 
{
public static void main(String[] args) {
	int Num=121;
	int revNum=0;
	for(int i=Num;i>0;i=i/10)
	{
	  int rem=i%10;
	  revNum=revNum*10+rem;
	}
	System.out.println(revNum);
	
	if(Num==revNum)
	{
		System.out.println("Given no. is palindrome");
	}
   else
    {
	System.out.println("Given no. is not palindrome");
	}
}
}

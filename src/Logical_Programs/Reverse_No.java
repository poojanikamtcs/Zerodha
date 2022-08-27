package Logical_Programs;

public class Reverse_No 
{
public static void main(String[] args) 
{
int num =12345;
int revnum=0;
for(int i=num;i>0;i=i/10)
{
 int rem = i%10;
 revnum = revnum*10+rem;
}
System.out.print(revnum);
}
}

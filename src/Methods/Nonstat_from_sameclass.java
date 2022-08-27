package Methods;

public class Nonstat_from_sameclass
{
public static void main(String[] args) 
{
Nonstat_from_sameclass n = new Nonstat_from_sameclass();

n.m1();
n.m2();
n.m3();

}

public void m1()
{
	System.out.println("running from m1 from same class");
}
public void m2()
{
	System.out.println("running from m2 from same class");
}
public void m3()
{
	System.out.println("running from m3 from same class");
}

}
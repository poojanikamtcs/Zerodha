package Hirarchicle;
public class Hirarchy_Inheritance 
{
public static void main(String[] args) {
	{
		Son1 s1 = new Son1();     // object
         s1.money();
         s1.car();
         s1.home();
         s1.SecBike();
		System.out.println("properties of Son 1");
		System.out.println(s1);

		Son2 s2 = new Son2();
	    s2.home();
		s2.car();
		s2.money();
		s2.secLappy();
		System.out.println("Properties of Son2");
		System.out.println(s2);
	
		Son3 s3 = new Son3();
		s3.home();
		s3.car();
		s3.money();
		s3.Secmob();
		System.out.println("properties of son 3");
		System.out.println(s3);
		
	}
}
}

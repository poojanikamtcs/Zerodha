package This_key;

public class Demo 
{                   //BLC
	int a = 50;     // global
	public void test()
	{
		int a =60;     // local
		System.out.println(a);
		System.out.println(this.a);
	}

}

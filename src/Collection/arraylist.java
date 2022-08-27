package Collection;

import java.util.ArrayList;

public class arraylist 
{
public static void main(String[] args) 
{
	ArrayList al = new ArrayList();
	al.add("Ganesh");
	al.add(100);
	al.add('A');
	al.add(null);
	al.add(100);
	al.add(null);
	System.out.println(al);     // it will print entire data in exsiting system
	System.out.println(al.size());   // it will give size
	// checks whether given value is present in arraylist or not 
	System.out.println(al.isEmpty());
	//insert new value inarraylist 
	al.add(2000);
	System.out.println(al.get(2));
	System.out.println(al);
	//remove elements from al
	al.remove(3);
	System.out.println(al);
}
}

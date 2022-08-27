package Collection;
import java.util.Vector;

public class Vectors 
{
public static void main(String[] args) 
{
Vector v = new Vector();
v.add("Samantha");
v.add('A');
v.add(null);
v.add(null);
v.add("Samantha");    // this is oldest class in collection
v.add(100);
v.add("Pooja");
System.out.println(v.size());
System.out.println(v.capacity());
System.out.println(v.isEmpty());
System.out.println(v.contains(200));     // false
System.out.println(v.get(0));    //it will fetch index value
//insertion of elements
v.add(0,"pooja");
System.out.println(v);
//remove the data (left shift operator)
v.remove(0);
System.out.println(v);
// modify, replace, update, the data
v.set(1, 'B');
System.out.println(v);
}
}

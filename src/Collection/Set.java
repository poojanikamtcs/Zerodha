package Collection;
import java.util.HashSet;

public class Set 
{
public static void main(String[] args) 
{
HashSet hs = new HashSet();
hs.add("Rashmika");
hs.add(100);
hs.add('A');
hs.add(null);
hs.add(null);
hs.add(100);
//print entrie data
System.out.println(hs);
System.out.println(hs.isEmpty());    //false
System.out.println(hs.contains(200));   //true
System.out.println(hs.size());
}
}

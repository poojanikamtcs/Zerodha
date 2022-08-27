package Collection;
import java.util.LinkedList;

public class linkedlist 
{
public static void main(String[] args) 
{
LinkedList ll = new LinkedList();
ll.add("Pooja");
ll.add('D');
ll.add("Avantika");
ll.add(null);
ll.add(null);
ll.add("Pooja");
ll.add(100);
System.out.println(ll.size());
System.out.println(ll.get(6));
System.out.println(ll.get(5));
System.out.println(ll.isEmpty());
System.out.println(ll.contains(300));
System.out.println(ll.get(2));
ll.add(2,"Pooja Patil");
System.out.println(ll);
//remove data from collection
ll.remove(2);
System.out.println(ll);
//modification/updation/replace 
ll.set(0,"Pooja");
System.out.println(ll);
}
}

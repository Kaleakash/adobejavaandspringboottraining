import java.util.*;
public class CollectionDemo {
	public static void main(String args[]) {
	//Collection framework with generics 
	/*List ll = new ArrayList();
	ll.add(10);
	ll.add(true);
	ll.add("Ravi");
	//System.out.println(ll.get(0)+ll.get(1));
	Object obj = ll.get(1);
	if(obj instanceof Integer){
	Integer ii = (Integer)obj;
	}
	//int n = ii.intValue();	//converting Integer object to primitive int
	//System.out.println(n);
	*/
	
	// Collection Framework with Generics 
	//Set<Type> ss = new HashSet<Type>();
	//Type may be all wrapper classes, string or user-defined class. 
	
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);		//auto-boxing : primitive to object 
	ll.add(20);
	ll.add(30);

	int n =	ll.get(0);	//auto-unboxing : object to primitive 
	System.out.println(n);
	
	}
}
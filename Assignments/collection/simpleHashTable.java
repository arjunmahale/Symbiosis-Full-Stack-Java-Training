package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class simpleHashTable {

	public static void main(String[] args) {
		Hashtable<String, String> ht=new Hashtable<String, String>();
		ht.put("1", "first");
		ht.put("2", "second");
		ht.put("3", "third");
		ht.put("4", "fourth");
		ht.put("5", "fifth");
		ht.put("6", "sixth");
		ht.put("7", "seventh");
		ht.put("8", "eighth");
		ht.put("9", "nineth");
		ht.put("10", "tenth");
		System.out.println("size of hashtable : "+ht.size());
		System.out.println("hashtable in empty: "+ht.isEmpty());
		System.out.println("elements of hashtable : ");
		Enumeration value=ht.elements();
		while(value.hasMoreElements())
		{
			System.out.println(" " +value.nextElement());
		}
	}

}

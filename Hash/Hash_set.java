package Hash;
import java.util.HashSet;
import java.util.Iterator;
public class Hash_set {

	public static void main(String[] args) {
		// Creating a HashSet
		HashSet<Integer> set=new HashSet<>();
		// Inseting an element
		set.add(1);
		set.add(2);
		set.add(-1);
		set.add(1);
		set.add(-3);
		set.add(38);
		set.add(33);
		set.add(345);
		
		
		
		
		// size 
		System.out.println("Size of set is "+set.size());
		
		//Printing all element
		System.out.println(set);
		
			//delete an element
			set.remove(1);
			
			// size 
			System.out.println("Size of set is "+set.size());
					
			//Printing all element
			System.out.println(set);
		
		if(set.contains(2)) {
			System.out.println("2 is present");
		}
		
		
		System.out.println("Using an Iterator");
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}

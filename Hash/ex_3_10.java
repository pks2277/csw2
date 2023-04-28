package Hash;
import java.util.HashSet;
public class ex_3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a hash set.
		HashSet<String> hs = new HashSet<String>();
		// Add elements to the hash set.
		hs.add("India");
		hs.add("USA"); 
		hs.add("Brazil"); 
		System.out.println(hs);
		System.out.println("Hash Table contains USA : " + hs.contains("USA"));
		System.out.println("Hash Table contains UK : " + hs.contains("UK"));
		hs.remove("USA");
		System.out.println(hs);
		System.out.println("Hash Tablecontains USA : " + hs.contains("USA"));
	}

}

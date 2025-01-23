
import java.util.HashSet;
class HashSetDemo031 {
	void HSetMethod() {
		
		HashSet hashSet = new HashSet();
		hashSet.add(100);
		hashSet.add("Bharath");
		hashSet.add(9999.99);
		System.out.println(hashSet);		

		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}


public class Demo031 {
	public static void main(String[] args) {
		HashSetDemo031 obj = new HashSetDemo031();
		obj.HSetMethod();
		}
	}

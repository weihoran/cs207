import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleIteratorDemo {

	public static void main(String args[]) {

		ArrayList<String> names = new ArrayList<>();
		String[] names_array = new String[10];
		Map<Integer,String> names_map = new HashMap<>();
		names_map.put(1,"Bob");
		names_map.put(2,"Frank");

		names.add("Bob");
		names.add("Frank");
		names.add("Arnold");
		names.add("Robyn");

		// these iterators are independent of each other
		Iterator<String> it = names.iterator();
		Iterator<String> it2 = names.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(it.hasNext());
		System.out.println(it2.hasNext()); // TRUE OR FALSE?
		System.out.println(it2.next());

		for (String s : names) {
			System.out.println(s);
		}

		for(String s : names_array){
			System.out.println(s);
		}

		for(String s : names_map.values()){
			System.out.println(s);
		}

	}
}

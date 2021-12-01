package multiple_iterators;

import java.util.Iterator;

public class AllIntegers implements Iterable<Integer> {
	
	@Override
	public Iterator<Integer> iterator() {
		return new AllIntegersIterator();
	}
}

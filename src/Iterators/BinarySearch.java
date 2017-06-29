package Iterators;

import java.util.Iterator;

public class BinarySearch implements Iterator{

	double x0 = 1;
	
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Object next() {
		Object answer = Math.log(x0)/Math.log(2);
		x0++;
		return answer;
	}

}

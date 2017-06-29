package iterators;

import java.util.Iterator;

public class Fibonacci implements Iterator{

	int x0 = 0;
	int x1 = 1;
	int n = 0;
	
	@Override
	public boolean hasNext() {
		return x1>0;
	}

	@Override
	public Object next() {
		Object answer = x0;
		int x = x1 + x0;
		x0 = x1;
		x1 = x;
		n++;
		return answer;
	}

}

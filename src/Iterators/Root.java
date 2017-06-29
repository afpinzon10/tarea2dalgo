package iterators;

import java.util.Iterator;

public class Root implements Iterator{

	int n = 1;
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Object next() {
		Object answer = Math.sqrt(n);
		n++;
		return answer;
	}

}

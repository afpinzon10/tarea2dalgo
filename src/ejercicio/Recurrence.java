package ejercicio;

import java.util.Iterator;

public class Recurrence {

	public final static int ROOT = 1;
	public final static int FIBONACCI = 2;
	public final static int BINARY_COMPLEX = 3;
	public final static int PRIME = 4;
	
	public Recurrence(int type) {
		if(type == ROOT){
	}
	
	
	 final class Root implements Iterator{
		
		int n = 1;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			Object answer = Math.sqrt(n);
			n++;
			return answer;
		}
		
	}
	
	private class Fibonacci implements Iterator{

		int x0 = 0;
		int x1 = 1;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			Object answer = x1;
			int x = x1 + x0;
			x0 = x1;
			x1 = x;
			return answer;
		}
		
	}
	
	private class BinaryComplexity implements Iterator{

		int x0 = 1;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			Object answer = x0;
			//x0 = 1 + 2*x; 
			return null;
		}
		
	}
	
	private class Prime implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}

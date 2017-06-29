package ejercicio;
import java.util.Iterator;
public class RecurrenceEquationExampleIterator implements Iterator {
	
	int x = 1;
	
	@Override
	public boolean hasNext() {
		
		return x>0;
	}
	
	@Override
	public Object next() {
		
		Object answer = x;
		x = 2*x;
		return answer;
	}
}
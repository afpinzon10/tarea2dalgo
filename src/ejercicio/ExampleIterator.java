package ejercicio;
import java.util.Iterator;

public class ExampleIterator {
	
	public static void main(String[] args) throws Exception {
		
		String iteratorClassName = args[0];
		Iterator it =
		 (Iterator)Class.forName(iteratorClassName).newInstance();
		int n = Integer.parseInt(args[1]);
		for(int i=0;i<n && it.hasNext();i++) {
		Object o = it.next();
		System.out.println(i+1 + " - " + o.toString());
		}
	}
}
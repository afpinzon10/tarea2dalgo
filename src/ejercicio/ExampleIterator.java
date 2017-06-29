package ejercicio;
import java.util.Iterator;

import parte1.Predicate;
import parte1.TestClass;

public class ExampleIterator {
	
	public static void main(String[] args) throws Exception {
		
		String iteratorClassName = args[0];
		Iterator it =
		 (Iterator)Class.forName(iteratorClassName).newInstance();
		int n = Integer.parseInt(args[1]);
		Predicate p = new TestClass();
		Object o = 0;
		boolean found = p.evaluarPredicado(o);
		
		for(int i=0;!found;i++) {
		o = it.next();
		found = p.evaluarPredicado(o);
		//System.out.println(i+1 + " - " + o.toString());
		}
		System.out.println(o.toString());
	}
}
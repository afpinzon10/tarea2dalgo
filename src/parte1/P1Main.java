package parte1;
import java.util.Iterator;

public class P1Main {

	public static void main(String[] args) throws Exception {

		/*Predicate it = new TestClass();
		int n = 100;
		boolean finish = false;
		int o = -1;
		for(int i=0;i<n && finish;i++) {
			o = i;
			finish = it.method(n);
		}
		System.out.println(o);*/




		String iteratorClassName = args[0];
		Iterator it = (Iterator)Class.forName(iteratorClassName).newInstance();
		int n = Integer.parseInt(args[1]);
		boolean finish = false;
		for(int i=0;i<n && finish;i++) {
			Object o = i;
			System.out.println(o.toString());
			finish = ((TestClass) it).method(i);
		}
	}
}
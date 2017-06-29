package Iterators;

import java.util.Iterator;

public class Primos implements Iterator{

	int x0 = 1;
	
	
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Object next() {
		x0++;
		if(!esPrimo(x0))
		{
			return x0;
		}
		else{
			
			return next();
			
		}
		
		
	}

	
	public boolean esPrimo(int i){
	    boolean esPrimo = false;

	    for (int j = 2; j <= Math.sqrt(i) && !esPrimo; j++) {
	         if (i % j == 0) {
	              esPrimo = true;
	       }
	    }
	     return esPrimo;
	}
	        
	    
}

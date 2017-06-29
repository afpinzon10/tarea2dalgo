package parte2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import iterators.MIByCols;
import iterators.MIByDiags;
import iterators.MIByRows;
import iterators.MatrixIterator;

public class P2Main {

	public static void main(String[] args) throws IOException, Exception, IllegalAccessException, ClassNotFoundException {
		 String cadena;
		 String archivo = args[0];
		 int maxRow = Integer.parseInt(args[1]);
		 int maxCol = Integer.parseInt(args[2]);
		 Object[][] matrix = new Object[maxRow][maxCol];
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	        int fila = 0;
	        while((cadena = b.readLine())!=null) {
	            char[] c = cadena.toCharArray();
	            for (int i = 0; i < c.length; i++) {
					matrix[fila][i] = c[i];
					
				}
	            
	            fila++;
	        }
	        b.close();
	        String iteratorClassName = args[3];
	        MatrixIterator it = (MatrixIterator) Class.forName(iteratorClassName).newInstance();
	        it.setMatrix(matrix);
	        while(it.hasNext())
	        {
	        	System.out.print(it.next());
	        }
	}
}

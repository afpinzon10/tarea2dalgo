package iterators;

import java.util.Iterator;

public abstract class MatrixIterator implements Iterator{

	Object[][] matrix;
	int row = 0;
	int column = 0;
	int maxRow = 0;
	int maxColumn = 0;
	boolean rowChanged = false;
	boolean columnChanged = false;
	
	public void setMatrix(Object[][] matrix) {
		this.matrix = matrix;
		maxColumn = matrix.length;
		maxRow = matrix[0].length;
	}
	
	@Override
	public boolean hasNext() {
		return row<maxRow && column<maxColumn;
	}

	@Override
	public abstract Object next() ;

}

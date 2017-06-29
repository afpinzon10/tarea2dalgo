package iterators;

public class MIByCols extends MatrixIterator{

	@Override
	public Object next() {
		Object answer = matrix[row][column];
		if(row < maxRow-1){
			row++;
		}else{
			row = 0;
			column++;
		}
		return answer;
	}

}

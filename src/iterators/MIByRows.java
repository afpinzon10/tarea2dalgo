package iterators;

public class MIByRows extends MatrixIterator{

	@Override
	public Object next() {
		Object answer = matrix[row][column];
		if(column < maxColumn-1){
			column++;
		}else{
			column = 0;
			row++;
		}
		return answer;
	}

}

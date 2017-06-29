package iterators;

public class MIByDiags extends MatrixIterator{

	

	@Override
	public Object next() {
		Object answer = matrix[row][column];
		if(column == maxColumn-1){
			column = row+1;
			row = maxRow-1;
		}else if(row == 0){
			row = column + 1;
			column = 0; 
		}else{
			column++;
			row--;
		}
		
		return answer;
	}

}

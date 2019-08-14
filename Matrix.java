
public class Matrix {
	private int [][] matrix;
	
	public Matrix(int row, int col) {
		matrix = new int [row][col];
	}
	
	int getRow() {
		return matrix.length;
	}
	
	int getCol() {
		return matrix[0].length;
	}
	
	int getValueAt(int row, int column) {
		return matrix[row][column];
	}
	
	void setValueAt(int row, int column, int value) {
		matrix[row][column] = value;
	}
	public String toString() {
		return getString();
	}
	
	String getString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < matrix.length; i ++) {
			if(i != 0) {
				sb.append("\n");
			}
			for( int j = 0; j < matrix[i].length; j++) {
				sb.append(matrix[i][j] + "\t");
			}
		}
		return sb.toString();
	}
	
	static Matrix add(Matrix one, Matrix other) {
		 if(one.getRow() != other.getRow() || one.getCol() != other.getCol()) {
			 return new Matrix(0, 0);
		 }
		 Matrix result = new Matrix(one.getRow(), one.getCol());
		 for (int i = 0; i < one.getRow(); i++) {
			 for (int j = 0; j < one.getCol(); j++) {
				 result.setValueAt(i, j, one.getValueAt(i, j) + other.getValueAt(i, j));  
			 }
		 }
		return result;
	 }
	 
	 Matrix multiply(int x) {
		 Matrix result = new Matrix(matrix.length, matrix[0].length);
		 for (int i = 0; i < matrix.length; i++) {
			 for (int j = 0; j < matrix[0].length; j++) {
				 result.setValueAt(i, j, matrix[i][j] * x);
			 }
		 }
		 return result;
	 }
	 
	 int getDiagonalSum() {
		 int sum = 0;
		 if(matrix.length != matrix[0].length) {
			 return Integer.MIN_VALUE;
		 }
		 for (int i = 0; i < matrix.length; i ++) {
			 for (int j = 0; j < matrix[i].length; j++) {
				 if(i == j) {
					 sum += matrix[i][j];
				 }
			 }
		 }
		 return sum;
	 }
	
}


package Anant;

public class MatrixMultiplication {
	
	public static int [][] multiplication(int[][]matrix1, int[][]matrix2)
	{
		int row1=matrix1.length;
		int col1=matrix1[0].length;
		int row2=matrix2.length;
		int col2=matrix2[0].length;
		int [][] result= new int[row1][col2];
		if(col1!=row1)
		{
			System.out.println("dimension are not correct");
			return result;
		}
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				for(int k=0;k<col1;k++)
				{
					result[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
				
				}
		return result;
	}
	public static void display(int[][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
		}
			System.out.println();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
		int [][] matrix2= {{1,1,1},{1,1,1},{1,1,1}};
		int[][] result =new int[matrix1.length][matrix2.length];
		result=multiplication(matrix1,matrix2);
		display(result);
		
	}

} 

package linearalgebra;

import java.util.Scanner;

/**
 * 
 * 
 * @author Trevor Novak
 * @version v0.0.1
 *
 */
public class Matrix implements Operations<Matrix>
{
	private double[][] matrix; //n x m matrix
	private int row, col; //row and column sizes
	
	public Matrix(int n, int m)
	{
		row = n;
		col = m;
		this.matrix = new double[this.row][this.col];
	}
	
	public Matrix(double[][] matrix)
	{
		row = matrix.length;
		col = matrix[0].length;
		this.matrix = matrix.clone();
	}
	
	public static void main(String[] args)
	{
		/*Matrix m = new Matrix(2, 3);
		m.buildMatrix();
		System.out.print(m.toString());
		Matrix n = new Matrix(3, 2);
		n.buildMatrix();
		Matrix r = new Matrix(3, 3);
		r.buildMatrix();
		
		//r = m.add(n);
		System.out.println(" ");
		//System.out.println(n.toString());
		//r = m.multiply(n);
		System.out.println(r.toString());
		r = r.transpose();
		//System.out.println(m.dotProduct(n));
		System.out.println(r.toString());*/
		/*double[][] M = {{15, 2, -9}, {-9, -1, 2}, {3, 5, 13}};
		//double[][] M = {{1, 2, 3}, {-2, 4, -6}};
		Matrix l = new Matrix(M);
		//l.setRow(3);
		//l.setCol(4);
		System.out.println(l);
		System.out.println(" ");
		Matrix K = new Matrix(l.getRow(), l.getCol());
		K = l.rowReduce();
		System.out.println(K);*/
		System.out.println("What do we do now?");
	}
	
	public void setMatrix(double[][] a)
	{
		matrix = a;
	}
	
	public void setRow(int n)
	{
		row = n;
	}
	
	public void setCol(int m)
	{
		col = m;
	}
	
	public double[][] getMatrix()
	{
		return this.matrix;
	}
	
	public int getRow()
	{
		return this.row;
	}
	
	public int getCol()
	{
		return this.col;
	}
	
	public int getMatrixEntry()
	{
		int entry = 0;
		
		Scanner scan = new Scanner(System.in);
		try
		{
			while(scan.hasNext())
			{
				System.out.println("Please enter an entry ->");
				entry = scan.nextInt();
			}
		}
		catch(java.util.InputMismatchException e) 
		{
			scan.next();
		}
		finally
		{
			scan.close();
		}
		
		return entry;
	}
	
	public void buildMatrix ()
	{	int count = 0;
	
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				this.matrix[i][j] = count++;
			}
		} 
	}
	
	public boolean isSquare()
	{
		boolean square = false;
		
		if(row == col)
			square = true;
		else
			square = false;
		
		return square;
	}
	
	public boolean isEqual(Matrix a)
	{
		boolean equal = false;
		
		if(row == a.row && col == a.col)
			equal = true;
		else
			equal = false;
		
		return equal;
	}
	
	public String toString ()
	{
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < row; i++)
		{
				builder.append("| ");
				
			for(int j = 0; j < col; j++)
			{
				builder.append(matrix[i][j]);
				builder.append(" ");
			}
			builder.append("|\n");
		}
		
		return builder.toString();
	}

	/**
	 * Adds this.matrix to a.matrix to produce a new matrix, C. 
	 * 
	 * @param Matrix a
	 * @return Matrix C, a Matrix object, which is the result of Matrix A + Matrix B. 
	 * 
	 * */
	@Override
	public Matrix add(Matrix a)
	{
		Matrix C = new Matrix(row, a.row);
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				C.matrix[i][j] = matrix[i][j] + a.matrix[i][j];
			}
		}
		return C;
	}

	@Override
	public Matrix subtract(Matrix a)
	{
		Matrix C = new Matrix(row, a.row);
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				C.matrix[i][j] = matrix[i][j] - a.matrix[i][j];
			}
		}
		return C;
	}

	@Override
	public Matrix multiply(Matrix a)
	{
		int sum;
		
		Matrix C = new Matrix(row, a.col);
		
		for(int i = 0; i < row; i++)
		{	
			for(int j = 0; j < a.col; j++)
			{
				sum = 0;
				for(int k = 0; k < a.row; k++)
				{
					sum += matrix[i][k] * a.matrix[k][j];
				}
		
			C.matrix[i][j] = sum;
			
			}
		}
		return C;
	}

	@Override
	public Matrix transpose()
	{
		Matrix transposed = null;
		
		if(isSquare())
		{
			transposed = new Matrix(col, row);
			
			for(int i = 0; i < row; i++)
			{
				for(int j = 0; j < col; j++)
				{
					transposed.matrix[j][i] = matrix[i][j];
				}
			}
		}
				
		return transposed;
	}

	@Override
	public Matrix inverse(Matrix a)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double dotProduct(Matrix a)
	{
		double sum = 0;
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				sum += matrix[i][j] * a.matrix[j][i];
			}
		}
		return sum;
	}

	@Override
	public Matrix crossProduct(Matrix a)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public Matrix rowReduce()
	{
		Matrix rred = new Matrix(row, col);
		rred.matrix = matrix.clone();
		
		int lead = 0;
		for(int r = 0; r < row; r++)
		{
			if(col <= lead)
			{
				break;
			}
			
			int i = r;
			while(rred.matrix[i][lead] == 0)
			{
				i++;
				if(row == i)
				{
					i = r;
					lead++;
					if(col == lead)
					{
						lead--;
						break;
					}
				}
			}
			for(int j = 0; j < col; j++)
			{
				double temp = rred.matrix[r][j];
				rred.matrix[r][j] = rred.matrix[i][j];
				rred.matrix[i][j] = temp;
			}
			double div = rred.matrix[r][lead];
			if(div != 0)
			{
				for(int j = 0; j < col; j++)
				{
					rred.matrix[r][j] /= div;
				}
			}
			for(int j = 0; j < row; j++)
			{
				if(j != r)
				{
					double sub = rred.matrix[j][lead];
					for(int k = 0; k < col; k++)
					{
						rred.matrix[j][k] -= (sub * rred.matrix[r][k]);
					}
				}
			}
			lead++;
		}

		return rred;
	}

	/*
	 * int i,j,k, n;
		int scalar;
		
		i = 0;
		for(j=1; j < row; j++)
		{
			if(i > j)
			{
				scalar = (matrix[i][j] / matrix[j][j]);
				for(k = 1; k <= row+1; k++)
				{
					matrix[i][k] = matrix[i][k] - scalar*matrix[j][k];
				}
			}
		}
	 */
	
	

}

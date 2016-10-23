package orthonormal.structures;

import orthonormal.operations.Operations;

public class Vector implements Operations<Vector>
{
	int row, col;
	double[][] vector;
	
	public Vector(double[][] vector)
	{
		row = vector.length;
		col = vector[0].length;
		this.vector = vector.clone();
	}
	
	public Vector(int row, int col)
	{
		this.row = row;
		this.col = col;
		this.vector = new double[row][col];
	}

	@Override
	public Vector add(Vector a)
	{
		Vector v = new Vector(row, a.row);
		
		for(int i = 0; i < this.row; i++)
		{
			for(int j = 0; j < this.col; j++)
			{
				v.vector[i][j] = vector[i][j] + a.vector[i][j];
	
			}
		}
		
		return v;
	}

	@Override
	public Vector subtract(Vector a)
	{
		Vector v = new Vector(row, a.row);
		
		for(int i = 0; i < this.row; i++)
		{
			for(int j = 0; j < this.col; j++)
			{
				v.vector[i][j] = vector[i][j] - a.vector[i][j];
	
			}
		}
		
		return v;
	}

	@Override
	public Vector multiply(Vector a)
	{
		int sum;
		
		Vector v = new Vector(row, a.col);
		
		for(int i = 0; i < row; i++)
		{	
			for(int j = 0; j < a.col; j++)
			{
				sum = 0;
				for(int k = 0; k < a.row; k++)
				{
					sum += vector[i][k] * v.vector[k][j];
				}
		
			v.vector[i][j] = sum;
			
			}
		}
		return v;
	}

	@Override
	public Vector transpose()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector inverse(Vector a)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double dotProduct(Vector a)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector crossProduct(Vector a)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}

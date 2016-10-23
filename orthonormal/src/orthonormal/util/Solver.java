package orthonormal.util;

import orthonormal.operations.Operations;
import orthonormal.structures.Matrix;
import orthonormal.structures.Vector;

/**
 * 
 * NOTE: Solver should accept matrix and vector objects, and then process them accordingly. 
 * For instance, we pass a matrix and a vector into the Solver --
 * immediately, the Solver recognizes that it can only multiply these two objects,
 * and performs the requested multiplication algorithm (likely implemented directly into the solver). 
 * 
 * Otherwise, the Solver merely calls the individual operations associated with each
 * object (matrix calls matrix.add and vector calls vector.add).
 * 
 * 
 * 
 * @author Trevor Novak
 *
 * @param <T>
 * @param <K>
 */

public class Solver<T, K>
{
    
    
    public Solver()
    {

    }
    
    public static void main(String[] args)
    {
	Matrix m = new Matrix(4,4);
	Vector v = new Vector(4,4);
	
	
	Solver<Matrix, Vector> s = new Solver<Matrix, Vector>();
	
	
    }
    
    /*public Solver<T, K> reflect(T t, K k)
    {
	
	if (t instanceof Matrix && k instanceof Vector)
	{
	    Solver<Matrix, Vector> solver = new Solver<Matrix, Vector>();
	}
	else if(t instanceof Vector && k instanceof Matrix)
	{
	    Solver<Vector, Matrix> solver = new Solver<Vector, Matrix>();
	}
	else if(t instanceof Vector && k instanceof Vector)
	{
	    Solver<Vector, Vector> solver = new Solver<Vector, Vector>();
	}
	else
	{
	    Solver<Matrix, Matrix> solver = new Solver<Matrix, Matrix>();
	}
	
	
	return solver;
    }*/
}

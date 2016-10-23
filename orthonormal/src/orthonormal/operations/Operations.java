package orthonormal.operations;

public interface Operations<T>
{
	public T add(T a);
	
	public T subtract(T a);
	
	public T multiply(T a);
	
	public T transpose();
	
	public T inverse(T a);
	
	public double dotProduct(T a);
	
	public T crossProduct(T a);
	
	
}

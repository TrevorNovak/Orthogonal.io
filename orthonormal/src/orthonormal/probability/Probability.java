package orthonormal.probability;
 

public class Probability
{
    public Probability()
    {
	
    }
    
    public static void main (String[] args)
    {
	Probability p = new Probability();
	System.out.print(p.permutation(10));
    }
    
    public int permutation(int n)
    {
	return factorial(n);
    }
    
    public int factorial(int n)
    {
	int sum = 0;
	
	if(n <= 1) return 1;
	sum = n * factorial(n-1);
	
	return sum;
    }
    
    public float probability(int A, int n)
    {
	
    }
    
    
}

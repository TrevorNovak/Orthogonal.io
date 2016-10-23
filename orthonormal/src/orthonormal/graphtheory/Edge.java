package orthonormal.graphtheory;

public class Edge
{
    Vertex vertex;
    String label;
    
    public Edge(Vertex vertex, String label)
    {
	this.vertex = vertex;
	this.label = label;
    }
    
    public Vertex getVertex()
    {
	return this.vertex;
    }
    
    public void setVertex(Vertex vertex)
    {
	this.vertex = vertex;
    }
    
    public String getLabel(String label)
    {
	return this.label;
    }
    
    public void setLabel(String label)
    {
	this.label = label;
    }
    
}

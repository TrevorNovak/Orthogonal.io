package orthonormal.graphtheory;

public class Vertex
{
    char label;
    Edge edge;
    
    boolean hasEdge;
    
    public Vertex(char label, Edge edge)
    {
	this.label = label;
	this.edge = edge;
    }
    
    public char getLabel()
    {
	return this.label;
    }
    
    public void setLabel(char label)
    {
	this.label = label;
    }
    
    public Edge getEdge()
    {
	return this.edge;
    }
    
    public void setEdge(Edge edge)
    {
	this.edge = edge;
    }
    
    public boolean hasEdge()
    {
	return this.hasEdge;
    }
    
    
}

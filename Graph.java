import java.util.*;
public class Graph
{
	List<Edge> G[];
	public Graph(int n)
	{
		G= new LinkedList[n];
		for(int i=0;i<G.length;i++)
		{
			G[i]=new LinkedList<Edge>();
		} 
	}

	@Override
	public String toString()
	{
		String result=" ";
		for(int i=0;i<G.length;i++)
		{
			result+=i+"=>"+G[i]+"\n";
		}
		return result;
	}
}
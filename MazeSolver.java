import java.util.LinkedList;
import java.util.Queue;
public class MazeSolver<T>
{
	private LList<String> path= new LList<String>();
	private static final int ROAD = 0;
	private static final int WALL = 1;
	private static final int START = 2;
	private static final int EXIT = 3;
	private static final int PATH = 4;


	private int[][] maze;
	private boolean[][] visited;
	private int vertices;
	private T start;
	private T end;

	public MazeSolver()
	{
		maze=new int [0][0];
		visited= new boolean[0][0];
		start=null;
		end= null;

	}
	public MazeSolver(int row,int col)
	{
		maze = new int [row][col];
		visited = new boolean[row][col];
		vertices=col+row;
		start=null;
		end=null;
	}
	public void addEdge(int i,int j)
	{
		maze[i][j]=1;
		maze[j][i]=1;
	}

	public void removeEdge(int i,int j)
	{
		maze[i][j]=0;
		maze[j][i]=0;
	}

	public void Display()
	{
		for(int i=0;i<maze.length;i++)
		{
			for(int j=0;j<maze.length;j++)
			{
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

	/*public void findbfs(int[][] maze,int start,int destination)
	{
		int [][] dirs ={{0,1},{0,-1},{1,0},{-1,0}};
		Queue data = new LinkedList();
		while(data.isEmpty())
		{
			if(x==)

		}

	}*/







	public boolean issafe(int[][] arr,int x,int y,int n )
	{
		if(x<n && y<n && arr[x][y]==1)
		{
			return true;
		}
		return false;

	}


	public Boolean ratinmaze(int[][] arr,int x,int y,int n,int[][] solarr)
	{
		if(x==n-1&&y==n-1)//base case
		{
			solarr[x][y]=9;
			return true;
		}
		if(issafe(arr,x,y,n))
		{
			solarr[x][y]=7;
			if(ratinmaze(arr,x+1,y,n,solarr))
			{
				return true;
			}
			if(ratinmaze(arr,x,y+1,n,solarr))
			{
				return true;
			}
			solarr[x][y]=1;		//backtracking
			return false;
		}
		return false;
	}






}
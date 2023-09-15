import java.util.*;
import java.io.File;
public class testmaze
{
	public static void main(String[] args) 
	{
		File file = new File("C:/Users/SMART LAPTOP/Desktop/Final Assignment/maze.txt");
		datacatcher check = new datacatcher(file);
		System.out.println(check.getfiletext());
		check.exchange();

		int [][] intmaze = {{1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							{1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
							{1,0,1,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1},
							{1,0,1,0,0,1,0,0,0,0,1,0,1,1,1,1,1,1,0,1,0,1},
							{1,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,1,0,1},
							{1,0,0,0,1,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1},
							{1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1},
							{1,0,0,0,0,0,1,1,0,0,0,0,1,0,0,1,0,1,1,1,1,1},
							{1,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1},
							{1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,1,1,1,1,1},
							{1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1},
							{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1}};

		System.out.println();
		System.out.println();
		int row=0;
		int col=0;
		for(row=0;row<intmaze.length;row++)
		{
			for(col=0;col<intmaze[row].length;col++)
			{
				System.out.print(intmaze[row][col]);
			}
			System.out.println();
		}
		int start=0;
		int end =0;


		System.out.println(" ROW "+row);
		System.out.println(" COL "+col);
		System.out.println(intmaze.length);

		MazeSolver check1= new MazeSolver();

		int [][] solarray = intmaze;

		if(check1.ratinmaze(intmaze,0,0,intmaze.length,solarray))
		{
			for(int i=0;i<solarray.length;i++)
			{
				for(int j=0;j<solarray[i].length;j++)
				{
					System.out.print(solarray[i][j]);
				}
				System.out.println();
			}
		}  







		
		//ArrayList<String> printmaze = datacatcher.mazeinprogram();
		//String print[][]=datacatcher.mazeinprogram(); 
		/*for(int i=0;i<print.length;i++)
		{
			for(int j=0;j<print.length;j++)
			{
				System.out.print(print[i][j]);
			}
			System.out.println();
		}

		MazeSolver sol = new MazeSolver(5,5);

		sol.addEdge(0,1);
		sol.addEdge(1,0);


		sol.Display();*/




		
	}
}
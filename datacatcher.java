import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class datacatcher
{
	private String finaldata;

	//private int[][]m;
	private String filetext;

	public datacatcher(File m)
	{
		filetext= "";
		try
		{
			Scanner input = new Scanner(m);
			while(input.hasNext())
			{
				filetext+=input.nextLine()+"\n";
			}
			initializemaze(filetext);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println(filetext);
		//System.out.println(filetext.length());
	}

	public String getfiletext()
	{
		return filetext;
	}

	public void exchange()
	{
		finaldata=getfiletext();
		finaldata=finaldata.replace("#","1");
		finaldata=finaldata.replace(" ","0");
		finaldata=finaldata.replace("s","2");
		finaldata=finaldata.replace("e","3");
		System.out.println(finaldata);
	}

	

	private void initializemaze(String text)
	{
		if(text==null || (text=text.trim()).length()==0)
		{
			throw new IllegalArgumentException("Empty lines data");
		}
	}
}

























		//ArrayList<ArrayList<String>>
		/*ArrayList<ArrayList<String>> mazelist = new ArrayList<ArrayList<String>>(); 
		//String mazearray[][]= new String [22][12];
		try
		{
			//ArrayList<String> str = new ArrayList<String>();  
			FileReader data = new FileReader("C:/Users/SMART LAPTOP/Desktop/Final Assignment/maze.txt");
			Scanner key = new Scanner(data);
			
			while(key.hasNext())
			{
				for(int i=0;i<mazearray.length;i++)
				{
					for (int j=0;j<mazearray.length;j++)
					{
						String str=key.next();
						mazearray[i][j]=str;
						
					}
				}
			} //while(key.hasNext())
			
			
			
			//System.out.println(mazelist.size());
			/*String mazearray[][] = new String[12][22];
			for(int i=0;i<mazearray.length;i++)
			{
				for (int j=0;j<mazearray.length;j++)
				{
					mazearray[i][j]=mazelist.get(j);
					
				}
			}


			for(int a=0;a<mazearray.length;a++)
			{
				for (int s=0;s<mazearray.length;s++ )
				{
					System.out.print(mazearray[a][s]);
					
				}
				System.out.println();
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}





		return mazearray;


	}

}*/

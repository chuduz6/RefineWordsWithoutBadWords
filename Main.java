import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] agrs)
	{
		readWrite("goodwordsSorted.txt", "a.txt");
		
	}
	
	public static void readWrite(String s, String s2)
	{
		String temp;
		char[] charTemp;
		int flag=0;
		File inputFile = new File(s);
		File outputFile = new File(s2);
		try
		{
			Scanner sc = new Scanner (inputFile);
			while(sc.hasNextLine())
			{
				temp=sc.nextLine();
				temp = temp.toLowerCase();
				charTemp = temp.toCharArray();
				flag=0;
				for(int i=0; i<charTemp.length; i++)
				{
					if(charTemp[i] < 'a' || charTemp[i] > 'z')
						flag=1;
				}
				
				
				if(flag==0)
				{
					FileWriter fw = new FileWriter(outputFile, true);
					fw.write(temp + "\n");
					fw.close();	
				
				}

			}
			
			sc.close();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.exit(1);			
		}
		
	}
	
	
}
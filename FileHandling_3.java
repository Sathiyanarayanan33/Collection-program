package collection;//bufferedReader & bufferedWriter

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_3 {

	public static void main(String[] args) {
      
	    File text=new File("/home/sathiya/today/sathiya.txt");
	    		
	    FileWriter fwriter;
		try {
			fwriter = new FileWriter(text);
			BufferedWriter bwriter=new BufferedWriter(fwriter);
			bwriter.write("Any where");
			bwriter.newLine();
			bwriter.write("Any thing");
			bwriter.newLine();
			bwriter.write("Something");
			bwriter.flush();
			bwriter.close();
			
			FileReader freader=new FileReader(text);
			BufferedReader breader=new BufferedReader(freader);
			String line=breader.readLine();
			while(line!=null)
			{
				System.out.println();
				line=breader.readLine();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

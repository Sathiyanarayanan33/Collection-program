package collection;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_2 {//File reader and file writter

	public static void main(String[] args) {
      File text=new File("/home/sathiya/today/sathiya.txt");
      
      try {
		text.createNewFile();
		FileWriter writer=new FileWriter(text);
		//writer.write(65);//return the ascii value
		writer.write("i am a java developer");
		writer.flush();
		writer.close();
		
		FileReader reader=new FileReader(text);
		int output= reader.read();
		char ca []=new char[(int)text.length()];
		System.out.println(ca.length);
		reader.read(ca);
		for(char ch1: ca)
			System.out.print(ch1);
			
//		while(output!=-1)
//		{
//			System.out.println(output);
//			output= reader.read();
//		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}

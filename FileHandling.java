package collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
String s="India is my country";
char c[]=s.toCharArray();
//System.out.println();
File folder=new File("/home/sathiya/jpr6");
folder.mkdir();

String filenames[]=folder.list();
for(String ss: filenames) {
	   System.out.println(ss);
}

folder.isDirectory();//true
File f=new File(folder,"document.txt");
f.isFile();

System.out.println(f.exists());//false

f.createNewFile();//file creating


System.out.println(f.exists());
try {
	FileWriter fw=new FileWriter(f,true);
	fw.write(c);
	fw.close();
}
catch
(IOException e) {
	e.printStackTrace();
}

	}

}

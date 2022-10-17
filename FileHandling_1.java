package collection;

import java.io.File;
import java.util.Scanner;

public class FileHandling_1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Words");
		String s=sc.next();
		char c[]=s.toCharArray();
		File folder=new File("/home/sathiya/today");
		folder.mkdir();
		//System.out.println();
		
	}

}

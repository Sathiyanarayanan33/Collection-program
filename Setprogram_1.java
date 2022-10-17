package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Setprogram_1 {

	public static void main(String[] args) {

		List ls=new ArrayList();
		ls.add("yuga");
		ls.add(34.44);
		ls.add(true);
		ls.add("yuga");
		
		System.out.println(ls);
		
		Set hs=new HashSet(ls);
		
		hs.add("Sathiya");
	    hs.add("Sathiya");
		hs.add("yuga");
		hs.add("satham");
		
		System.out.println(hs);
		
		Set h=new TreeSet();
		
		h.add("Sathiya");
	    h.add("Sathiya");
	    h.add('a');
		h.add("yuga");
		h.add("satham");
		System.out.println(h);
		
		
			
		}
		
	
	}



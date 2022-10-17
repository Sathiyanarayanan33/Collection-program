package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Setprogram_2 {

	public static void main(String[] args) {
      Set obj=new HashSet();
      
      obj.add("sathiya");
      obj.add("yugaraj");
      obj.add('b');
      int a=12;
      obj.add(a);
      obj.add("sathiya");

      System.out.println(obj);
      
      List ls=new ArrayList();
      
      ls.add("sathiya");
      ls.add("yugaraj");
      ls.add('b');
      int b=12;
      ls.add(b);
      ls.add("sathiya");
      System.out.println(ls);
      
      List l=new LinkedList();
      
      l.add("sathiya");
      l.add("yugaraj");
      l.add('b');
      int c=13;
      l.add(c);
      l.add("sathiya");
      System.out.println(l);
	}

}

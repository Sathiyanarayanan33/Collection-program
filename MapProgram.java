package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapProgram {

	public static void main(String[] args) {
		Map<String, Integer> obj=new<String, Integer> HashMap();
		
		obj.put("Tea", 10);
		obj.put("Cofee", 15);
		obj.put("Milk", 10);
		obj.put("Masal Dhosa", 40);
		obj.put("Podi Dhosa", 50);
		obj.put("Nice Dhosa", 40);
		obj.put("Butter Dhosa", 50);
		obj.put("Kari Dhosa", 50);
		obj.put("Idly", 20);
		obj.put("Masal Idly", 20);
		obj.put("Podi Idly", 20);
		obj.put("Ravaa Idly", 10);
		obj.put("Kelangu Boori", 40);
		obj.put("Sambar Boori", 40);
		obj.put("Masal Boori", 40);
		obj.put("Vada", 10);
		//obj.keySet();
		//System.out.println();
		
		
		
		
		for(Map.Entry m:obj.entrySet()) {
			//System.out.println(m.getKey()+" "+m.getValue());
			Set l=new HashSet();
			System.out.println(m.getKey());
		}
		
		
	}

}

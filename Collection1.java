package collection;//ananymous object

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {

		List store=new ArrayList();
		
		store.add(new Student("sathiya","CB17S250781",55,22));
		store.add(new Student("sadham","CB17S250782",52,24));
		store.add(new Student("yuga","CB17S250783",60,23));
		
		store.add(new Car("Maruthi",5,"RED",100000));
		store.add(new Car("Audi",5,"Black",10000000));
		store.add(new Car("BMW",5,"white",10000000));
		
		store.add(new Mobile("Samsung",22,20000,"camera quality"));
		store.add(new Mobile("Vivo",23,25000,"Hd display"));
		store.add(new Mobile("Nokia",17,30000,"12 gp ram"));

		for(Object t:store)	//advance forloop
		System.out.println(t);
		
        List Students_Details=new ArrayList();	
		List Car_Detail=new ArrayList();
		List Mobile_Detail=new ArrayList();
		
		for(Object o:store)
		{
			int sum=0;
			if(o.getClass().equals(Student.class)) {
				Students_Details.add(o);
				System.out.println(Student.class);
		}
			
			else if(o.getClass().equals(Car.class)) {
				Car_Detail.add(o);
				System.out.println(o.getClass());
			}
			
			else if(o.getClass().equals(Mobile.class)) {
				Mobile_Detail.add(o);
				System.out.println(Mobile.class);
				
			}	
		}	
	}	
}

package collections;

import java.util.*;
import java.util.Collections;

class Employee2 
{
	String name;
	int empId;
	public Employee2(String name,int empId)
	{
		super();
		this.name=name;
		this.empId=empId;
	}
}
	class NewComparator implements Comparator
	{
	
	public int compare(Object o1,Object o2) 
	{
		
		Employee2 e1=(Employee2)o1;
		Employee2 e2=(Employee2)o2;
		if(e1.empId>e2.empId) 
			return 1;
			else if(e1.empId<e2.empId) 
				return -1;
				else 
					return 0;
				}
		
	}
	
public class CollectionsCompare {

	public static void main(String [] args) 
	{
		ArrayList<Employee2> a1=new ArrayList<Employee2>();
		 a1.add(new Employee2("arjun",11));
		 a1.add(new Employee2("raju",12));
		 a1.add(new Employee2("ravi",13));
		 a1.add(new Employee2("aaon",10));
		 		 
		 Collections.sort(a1, new NewComparator());
		 for(Employee b:a1) 
		 {
			 System.out.println(b.empId+" "+b.name);
		 }
	}
}

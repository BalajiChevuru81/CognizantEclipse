package collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	 String name ;
	int empId;
	
	public Employee(String name)
	{
		this.name=name;
	}
	public int compareTo(Employee person) 
	{
		return name.compareTo(person.name);
	}
}

public class CollectionEmp {

	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		 a1.add(new Employee("arjun"));
		 a1.add(new Employee("raju"));
		 a1.add(new Employee("ravi"));
		 a1.add(new Employee("aaon"));
		 
		 Collections.sort(a1);
		 for(Employee b:a1)
			 System.out.println(b.name);
		 

	}

}

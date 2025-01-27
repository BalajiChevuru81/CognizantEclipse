package collections;

import java.util.ArrayList;
import java.util.Collections;


class Employee1 implements Comparable<Employee1>{
	int empid,ename;
	String elocation;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", elocation=" + elocation + "]";
	}

	public Employee1(int empid, int ename, String elocation) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.elocation = elocation;
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEname() {
		return ename;
	}

	public void setEname(int ename) {
		this.ename = ename;
	}

	public String getElocation() {
		return elocation;
	}

	public void setElocation(String elocation) {
		this.elocation = elocation;
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return o.empid;
	}	
}


public class EmployeeNewClass {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> a2=new ArrayList<Employee1>();
		a2.add(new Employee1(10, 20, "elocation"));
		a2.add(new Employee1(40, 30, "aloc"));
		Collections.sort(a2);
		for(Employee1 b1:a2)
		System.out.println(b1.empid);
	}

}

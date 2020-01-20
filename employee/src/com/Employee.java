package com;

public class Employee {
	int empId,salary;
	String ename, location;
	public Employee(int empId, int salary, String ename, String location) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.ename = ename;
		this.location=location;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

	

}

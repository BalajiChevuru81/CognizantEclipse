package com;

public class WegeEmployee extends Employee {
	int number,hour;

	@Override
	public String toString() {
		return "WegeEmployee [number=" + number + ", hour=" + hour + ", empId=" + empId + ", salary=" + salary
				+ ", ename=" + ename + ", location=" + location + "]";
	}

	public WegeEmployee(int empId, int salary, String ename, String location,int number,int hour) {
	super(empId,salary,ename,location);
	this.number=number;
	this.hour=hour;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
}

package comp;

public class EmpManagement {
	int empId,salary;
	String ename;
	public EmpManagement(int empId, int salary, String ename) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.ename = ename;
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

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpManagement m=new EmpManagement(10,2000,"raju");
		//m.setEmpId();
		//m.setSalary();
		//m.setEname();
		System.out.println(m.empId+" "+m.ename+" "+m.salary);
		m.setEmpId(11);
		m.setEname("ravi");
		m.setSalary(2500);
		System.out.println(m.getEmpId()+" "+m.getEname()+" "+m.getSalary());
		
	}

}

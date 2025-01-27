package lambdaExpression;
import java.util.*;
class LambdaEmp{
	int eid;float esalary; 
	String ename;
	    public LambdaEmp(int eid, float esalary, String ename) {
		super();
		this.eid = eid;
		this.esalary = esalary;
		this.ename = ename;
	}
}

public class LambdaExpExamples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LambdaEmp> e=new ArrayList<LambdaEmp>();
		e.add(new LambdaEmp(101, 10500f, "Uday"));
		e.add(new LambdaEmp(102, 10600f, "Anil"));
		e.add(new LambdaEmp(103, 10550f, "Siva"));
		e.add(new LambdaEmp(104, 10750f, "Venkat"));
		e.add(new LambdaEmp(105, 10650f, "Arjun"));
		System.out.println("Sorted by name");  
		Collections.sort(e,(p1,p2)->{  
        return p1.ename.compareTo(p2.ename);  
        });  
        for(LambdaEmp p:e){  
            System.out.println(p.eid+" "+p.ename+" "+p.esalary);  
        }  
	}
}

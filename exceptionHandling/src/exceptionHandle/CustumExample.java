package exceptionHandle;

class Agent extends Exception{
	Agent(String s){
	super(s);
}
}

public class CustumExample {
	static void validate(int age) throws Agent
	{
		if(age<18)
			throw new Agent("not allowed");
	else 
		System.out.println("Welcome to new vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(17);
		}
		catch (Exception r){
			System.out.println(r);
		}
		
	}

}

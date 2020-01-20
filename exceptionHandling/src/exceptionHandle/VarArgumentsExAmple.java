package exceptionHandle;

public class VarArgumentsExAmple {
	static void display(int... values)
	{
		int sum=0;
		System.out.println("Display method is invoke");
		for(int s:values) 
		{
			sum=sum+s;
		}
			System.out.println(sum);
		}	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		display();
		//System.out.println();
		display(1,3,5,7,9);
		
	}

}

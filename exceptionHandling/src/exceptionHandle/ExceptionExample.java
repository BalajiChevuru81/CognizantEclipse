package exceptionHandle;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=0;
		try {
		System.out.println(a/b);
		throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally is executed");
		}
		System.out.println("then executed");
	}
	

}

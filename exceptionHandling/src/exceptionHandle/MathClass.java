package exceptionHandle;
import java.util.Scanner;
public class MathClass 
{
	private static Scanner s;
	public static void main(String[] args) 
	{
		System.out.println("enter numbers");
		s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		double d=s.nextFloat();
		System.out.println("the maximum number"+Math.max(b,d));
		System.out.println("the min number"+Math.min(a,b));
		System.out.println(Math.ceil(d));
		System.out.println(Math.round(b));
		System.out.println(Math.sqrt(b));
		System.out.println(Math.floor(d));
	}
}

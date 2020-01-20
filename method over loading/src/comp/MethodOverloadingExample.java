package comp;

class Addition{
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
	}
}



public class MethodOverloadingExample {
	public static void main(String [] args)
	{
		Addition a=new Addition();
		System.out.println(a.add(10, 12));
		System.out.println(a.add(10.5, 13));
		System.out.println(a.add(14, 16.5));
	}

}

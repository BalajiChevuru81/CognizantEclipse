package string;
//import java.util.Scanner;
public class StringEqual 
{
public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int check=0;
		//Scanner s=new Scanner(System.in);
		String r="raju";
		String r1="raju";
		char[] a=r.toCharArray();
		char[] b=r1.toCharArray();
		if(r.length()!=r1.length())
		{
			System.out.println("not equal");
			System.exit(1);
		}
		else {
			System.out.println("equal");
		
		for(int i=0;i<r.length();i++) 
		{
		if(a[i]!=b[i])
			{
				System.out.println("string is not equal");
				check++;
			
			}
		}
		}
	}
}



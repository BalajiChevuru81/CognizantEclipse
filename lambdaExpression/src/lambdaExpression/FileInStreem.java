package lambdaExpression;
import java.io.*;
public class FileInStreem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fi=new FileInputStream("E:\\testout.txt");
		int i=fi.read();
		fi.close();
		System.out.println((char)i);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

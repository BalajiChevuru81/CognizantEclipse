package lambdaExpression;
import java.io.*;
class Student implements Serializable{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class WriteInFile {

	public static void main(String args[]){  
  try{   
  Student s1 =new Student(211,"Raju");    
  FileOutputStream fout=new FileOutputStream("E:\\fabc.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  out.writeObject(s1);  
  out.flush();  
  out.close();  
  System.out.println("success");  
  }
  catch(Exception e)
  	{
	  System.out.println(e);
	  }  
 }  
}  
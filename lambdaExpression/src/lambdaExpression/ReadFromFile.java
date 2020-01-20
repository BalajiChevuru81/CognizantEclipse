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
public class ReadFromFile{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		ObjectInputStream o=new ObjectInputStream(new FileInputStream("E:\\fabc.txt"));
		Student s=(Student)o.readObject();
		System.out.println(s.id+" "+s.name);
		o.close();
		}
	catch(Exception e) {
		System.out.println(e);
		}	
	}
}

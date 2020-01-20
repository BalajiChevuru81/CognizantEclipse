package collections;
import java.util.ArrayList;
public class CollectionInterface 
{
	public static void main(String[] args) 
	{
		ArrayList<String> e=new ArrayList<String>();
		e.add("a");
		e.add("b");
		e.add("c");
		System.out.println(e);
		ArrayList<String> e1=new ArrayList<String>();
		e1.add("d");
		e1.add("e");
		e1.add("f");
		e.addAll(e1);
		System.out.println(e);
		e.removeAll(e1);
		System.out.println(e);
		e.remove("a");
		System.out.println(e);
		e.clear();
		System.out.println(e);
	}
}

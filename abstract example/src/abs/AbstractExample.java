package abs;

abstract class AbstractClass {
	abstract void add1(int a,int b);
		void show() {
			System.out.println("this is abstract class");
		}
	}

class AbstractImpl extends AbstractClass {
	void add1(int a, int b) {
		System.out.println(a + b);
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		AbstractImpl a=new AbstractImpl();
		a.add1(10, 15);
	}
}

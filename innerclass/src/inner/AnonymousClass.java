package inner;

interface Eatable{
	void eat();

	void Eatable();
	
}

public class AnonymousClass {
public static void main(String []ags) {
	Eatable a=new Eatable() {	
		@Override
		public void eat() {	
			System.out.println("eat fruit");
			// TODO Auto-generated method stub
			a.Eatable();
		}
	};
}
}

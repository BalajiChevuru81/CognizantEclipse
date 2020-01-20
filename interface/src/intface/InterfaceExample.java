package intface;

class Airbus implements fly1 {
	public int fly1(int a) {
		return a;
	}
}

class AirAutomobile {
	// double speed=100;
	String modelNo;

	void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	String show() {
		return modelNo;
	}
}

interface fly1 {
	int speed = 100;

	int fly1(int a);
}

public abstract class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airbus a = new Airbus();
		System.out.println(a.fly1(10));
		System.out.println(fly1.speed);
	}
}

package autoProject;

public class MainAutomobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Air a=new Air(1,"Air India",100);
		System.out.println("Details of "+a);
		System.out.println("Details of takeoff "+a.takeoff1(11));
		Land l=new Land(2,"duke",150);
		System.out.println("Details of "+l);
		Water w=new Water(3,"lowerRace",110);
		System.out.println("Details of "+w);
	}

}

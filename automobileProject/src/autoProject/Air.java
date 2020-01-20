package autoProject;

public class Air extends Automobile implements fly,takeoff{
	public int fly1(int a){
		return a;
	}
	public int takeoff1(int b) {
		return b;
	}
	int speed;
	@Override
	public String toString() {
		return "Air [speed=" + speed + ", autoId=" + autoId + ", autoName=" + autoName + "]";
	}
	public Air(int autoId, String autoName, int speed) {
		super(autoId, autoName);
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/*String show() {
		return speed;
	}*/

}


interface fly {
	int speed = 100;

	int fly1(int a);
	
}
interface takeoff{
	int speed11=40;
	int takeoff1(int d);
}
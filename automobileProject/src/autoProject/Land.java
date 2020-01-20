package autoProject;

public class Land extends Automobile implements move {
	public int move1(int b)
	{
	return b;	
	}
	int speed1;
	@Override
	public String toString() {
		return "Land [speed1=" + speed1 + ", autoId=" + autoId + ", autoName=" + autoName + "]";
	}
	public Land(int autoId, String autoName, int speed1) {
		super(autoId, autoName);
		this.speed1 = speed1;
	}
	public int getSpeed1() {
		return speed1;
	}
	public void setSpeed1(int speed1) {
		this.speed1 = speed1;
	}
}

interface move {
	int speed1 = 110;

	int move1(int b);
}

package autoProject;

public class Water extends Automobile implements sail {
	public int sail1(int c)
	{
	return c;	
	}
	int speed2;
	@Override
	public String toString() {
		return "sail [speed2=" + speed2 + ", autoId=" + autoId + ", autoName=" + autoName + "]";
	}
	public Water(int autoId, String autoName, int speed2) {
		super(autoId, autoName);
		this.speed2 = speed2;
	}
	public int getSpeed2() {
		return speed2;
	}
	public void setSpeed2(int speed2) {
		this.speed2 = speed2;
	}
}

interface sail {
	int speed2 = 150;

	int sail1(int c);
}

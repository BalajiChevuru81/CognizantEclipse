package autoProject;

public class Automobile {
int autoId;
String autoName;
public Automobile(int autoId, String autoName) {
	super();
	this.autoId = autoId;
	this.autoName = autoName;
}

public int getAutoId() {
	return autoId;
}
public void setAutoId(int autoId) {
	this.autoId = autoId;
}
public String getAutoName() {
	return autoName;
}
public void setAutoName(String autoName) {
	this.autoName = autoName;
}

}

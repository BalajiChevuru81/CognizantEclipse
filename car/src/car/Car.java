package car;

class Engin{
	int eid,enumber;
	String etype;
	@Override
	public String toString() {
		return "Engin [eid=" + eid + ", enumber=" + enumber + ", etype=" + etype + "]";
	}

	public Engin(int eid, int enumber, String etype) {
		super();
		this.eid = eid;
		this.enumber = enumber;
		this.etype = etype;
	}

	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
	}

	

	public Engin(int eid, int enumber) {
		super();
		this.eid = eid;
		this.enumber = enumber;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEnumber() {
		return enumber;
	}

	public void setEnumber(int enumber) {
		this.enumber = enumber;
	}
}


public class Car extends Engin {

	int cnumber;
	String cname;
	Engin e;
		
	@Override
	public String toString() {
		return "Car [cnumber=" + cnumber + ", e=" + e + ", cname=" + cname + ", eid=" + eid + ", enumber=" + enumber
				+ ", etype=" + etype + "]";
	}


	
	
	




	public Car(int eid, int enumber, String etype, int cnumber, String cname, Engin e) {
		super(eid, enumber, etype);
		this.cnumber = cnumber;
		this.cname = cname;
		this.e = e;
	}









	public int getCnumber() {
		return cnumber;
	}
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(1,200,"benz",12,"Audi",new Engin(9,99,"petrol"));
		System.out.println("Details of "+c);
	}

}

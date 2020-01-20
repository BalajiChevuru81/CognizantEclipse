package pakag;

public class Car {
	int carNumber;
	int run()
	{
		return 60;
	}
}
class FordCar extends Car
{
	int run()
	{
		return super.run()+40;
	}
	
	
	
}

package assignment1;

public class FourWheel extends Vehicle{

	public void run() {
		System.out.println("Four Wheeler is running");
	}
	public void stop() {
		System.out.println("Four Wheeler is stopped");
	}
	
	void FourWheel() {
		
	}
	int speed = 60;
	long distance = 500;
	int no_of_tires = 4;
	
	public void display() {
		System.out.println("The speed is: "+speed);
		System.out.println("The distance is :"+distance);
		System.out.println("No of tires: "+no_of_tires);
		System.out.println(super.speed);
		System.out.println(super.distance);
	
	}
}

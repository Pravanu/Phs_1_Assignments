package assignment1;

public class TwoWheel extends Vehicle{
	
	public void run() {
		System.out.println("Two Wheeler is running");
	}
	public void stop() {
		System.out.println("Two Wheeler is stopped");
	}
	
	void TwoWheel() {
		
	}
	int speed = 25;
	long distance = 100;
	int no_of_tires = 2;
	
	public void display() {
		System.out.println("The speed is: "+speed);
		System.out.println("The distance is :"+distance);
		System.out.println("No of tires: "+no_of_tires);
		System.out.println(super.speed);
		System.out.println(super.distance);
		
	}
}

package assignment1;

public class EightWheel extends Vehicle{
	
	public void run() {
		System.out.println("Eight Wheeler is running");
	}
	public void stop() {
		System.out.println("Eight Wheeler is Stopped");
	}
	
	void EightWheel() {
		
	}
	int speed = 80;
	long distance = 1000;
	int no_of_tires = 8;
	
	public void display() {
		System.out.println("The speed is: "+speed);
		System.out.println("The distance is :"+distance);
		System.out.println("No of tires: "+no_of_tires);
		System.out.println(super.speed);
		System.out.println(super.distance);
	}
}

package assignment1;

public class ThreeWheel extends Vehicle{
	
	public void run() {
		System.out.println("Three Wheeler is running");
	}
	public void stop() {
		System.out.println("Three Wheeler is Stopped");
	}
	
	void ThreeWheel() {
		
	}
	int speed = 35;
	long distance = 150;
	int no_of_tires = 3;
	
	public void display() {
		System.out.println("The speed is: "+speed);
		System.out.println("The distance is :"+distance);
		System.out.println("No of tires: "+no_of_tires);
		System.out.println(super.speed);
		System.out.println(super.distance);
}
}

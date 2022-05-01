package assignment1;

public  abstract class Vehicle {
	
	abstract void run();
	abstract void stop();
	
	public void fuel(int a) {
		System.out.println();
		System.out.println("fuel int "+a);
	}
	public void fuel(float f,String s) {
		System.out.println("fuel float and string "+f+", "+s);
	}
	public void fuel(char c,int b) {
		System.out.println("fuel char and int "+c+", "+b);
	}
	
	int speed=20;
	long distance=200;
	
	void Vehicle() {
		
	}
	
	void Vehicle(int s,long d) {
		speed=s;
		distance =d;
	}
}

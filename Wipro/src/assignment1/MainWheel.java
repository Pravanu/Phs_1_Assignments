package assignment1;

public class MainWheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheel ob = new TwoWheel();
		ob.run();
		ob.stop(); 
		ob.display();
		
		ThreeWheel ob1 = new ThreeWheel();
		ob1.run();
		ob1.stop();
		ob1.display();
		
		FourWheel ob2 = new FourWheel();
		ob2.run();
		ob2.stop();
		ob2.display();
		
		EightWheel ob3 = new EightWheel();
		ob3.run();
		ob3.stop();
		ob3.display();
		
		Vehicle obj =new EightWheel();
		obj.fuel(5);
		obj.fuel('a', 10);
		obj.fuel(2.5f, "p");
	}

}

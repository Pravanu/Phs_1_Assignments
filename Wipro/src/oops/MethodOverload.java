package oops;

public class MethodOverload {

	public int calculate(int a,int g) {
		int c=a+g;
		return c;
		
	}
	public float calculate(float r) {
		float z=3.14f*r*r;
		return z;
	}
	public int calculate(long b,long h) {
		double p= 0.5*b*h;
		 int i=(int)p;
		 return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload obj = new MethodOverload();
		System.out.println("Sum = "+obj.calculate(5, 6));
		System.out.println("Area of circle ="+obj.calculate(5));
		System.out.println("Area of rectangle ="+obj.calculate(2, 4));

	}

}

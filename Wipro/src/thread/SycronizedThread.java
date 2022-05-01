package thread;



public class SycronizedThread {

	synchronized public void factorial(int n) {
		int fact =1;
		for(int i=1;i<n+1;i++) {
			fact= fact*i;
		}
		System.out.println("The factorial of "+n+" is: "+fact);
	}
	
	synchronized public void add(int a,int b) {
		int c =a+b;
		System.out.println("The addition of "+a+" and "+b+" is: "+c);
	}
}	


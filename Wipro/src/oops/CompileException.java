package oops;

import java.io.IOException;
import java.util.Scanner;



public class CompileException {
	
	static void display(int l,int b) throws IOException {
		if(l>b) {
			throw new IOException("Wrong input");
		}
		else
			System.out.println("Both parameter is correct!");
	}
	
	static void areaFunc(int l,int b) throws IOException{
		display(l,b);
	}
	
	static int calculate(int l,int b) throws IOException{
		areaFunc(l,b);
		return l*b;
	}
	
	 public static void main(String args[]){  
		 int result=0;
		   Scanner scanner = new Scanner(System.in);  // taking user input from console
	       
	       System.out.println("Enter the length : ");
	       int num1 = scanner.nextInt();
	       
	       System.out.println("Enter the breadth : ");
	       int num2 = scanner.nextInt();
	      
	       try{
	    	  result =calculate(num1,num2);
	       }
	       catch(Exception ae)
	       {
	    	   System.out.println("Exception Occured:"+ae.getMessage());
	       }
	       
	       System.out.println("Result is : "+result);
	  } 
	
}

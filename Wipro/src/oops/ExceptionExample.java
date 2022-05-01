package oops;

import java.util.Scanner;

public class ExceptionExample {
		  
		   static void validate()throws CheckSalaryException{  
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter the salary:");
			   int sal = sc.nextInt();
			   
			 if(sal<2100) 
				 throw new CheckSalaryException("you need to work hard");  
		     else if(sal<5000 && sal>2100) 
		    	 throw new CheckSalaryException("your salary is somehow good");  
		     else if(sal>5100 && sal<9000)
		    	 throw new CheckSalaryException("salary is very good");
		   }  
		     
		   public static void main(String args[]){  
		      try{  
		        validate();  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+ m.getMessage());
		      }  
		  
		       
		  }  
		}  

	//This class is created for your own defined exception message
	class CheckSalaryException extends Exception{  // 1
		
		//private static final long serialVersionUID = 1L;

		CheckSalaryException(String s){  //2
		  super(s);  
		 }  
	}  




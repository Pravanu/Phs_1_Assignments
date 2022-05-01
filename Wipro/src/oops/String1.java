package oops;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String t = "Delhi";  // String Literal---> objects are created in string pool
		   String o = "Mumbai";
		   String k="delhi";
		 
		  // objects are created inside the heap
		   String y = new String("Mumbai");
		   String l = new String("delhi");
		   String p = new String("hello");
		   
		   if(o.equals(l))
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   if(o==l)
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   
		   if(y.equals(p))
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   if(y==p)
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   
		   if(t.equals(o))
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   if(t==o)
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   
		   
		   if(k.equals(y))
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   if(k==y)
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   
		   
		   if(p.equals(y))
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   if(o==y)
		   {
			   System.out.println("true?????");
		   }
		   else{
			   System.out.println("false????");
		   }
		   
		   
		 }  
	}



package collection;

import java.util.*;

public class SetAssignment1 {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();  // object creation of LinkedHashSet generic
		lhs.add(3);
		lhs.add(5);
		lhs.add(4.5f);
		lhs.add(5.6f);
		lhs.add(true);
		lhs.add('F');
		lhs.add('P');
		
	
		System.out.println("the linkedhasset is:" + lhs);
		
		LinkedHashSet<Integer> rhs = new LinkedHashSet<Integer>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers from 1 to 8 randomly:");
		int a=sc.nextInt();
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		int a4=sc.nextInt();
		int a5=sc.nextInt();
		int a6=sc.nextInt();
		int a7=sc.nextInt();
		
		rhs.add(a);
		rhs.add(a1);
		rhs.add(a2);
		rhs.add(a3);
		rhs.add(a4);
		rhs.add(a5);
		rhs.add(a6);
		rhs.add(a7);
		System.out.println("the LinkedHashSet is:"+rhs);
	}
	
}

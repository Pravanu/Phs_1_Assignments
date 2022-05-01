package collection;

import java.util.*;

public class SetAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
	        
	        
	        treeSet.add("Python");
	        treeSet.add("Java");
	        treeSet.add("C");
	        treeSet.add("C++");
	        treeSet.add("HTML5");
	        treeSet.add("CSS3");
	        System.out.println(treeSet);
	        
	        treeSet.remove("Python");
	        treeSet.remove("C++");
	        System.out.println(treeSet);
	        
	        treeSet.add("JavaScript");
	        treeSet.add("Jquery");
	        treeSet.add("NodeJs");
	        System.out.println(treeSet);
	        
	        System.out.println(treeSet.contains("Java"));
	        treeSet.clear();
	        System.out.println(treeSet);
	}

}

package inheritenceConcept;

public class A extends Product {
	
	
	int count = 50;
	String category = "butter";
	
	public void displayA() {
		
		super.display();
		System.out.println(count+" "+category);
		
	}
}

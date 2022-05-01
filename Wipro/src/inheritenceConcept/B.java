package inheritenceConcept;

public class B extends Product{

	int count = 90;
	String category = "milk";
	
	public void displayB() {
		
		super.display();
		System.out.println(count+" "+category);
		
	}
	
}

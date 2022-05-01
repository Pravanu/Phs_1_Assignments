package inheritenceConcept;

public class C extends Product {

	int count = 56;
	String category = "choco";
	
	public void displayC() {
		
		super.display();
		System.out.println(count+" "+category);
		
	}
	
}

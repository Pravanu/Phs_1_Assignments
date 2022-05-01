package inheritenceConcept;

public class SubB extends B {

	int price=10;
	public int calculatePrice() {
		int totalPrice = count*price;
		return totalPrice;
	}
	
	public void displaySubB() {
		super.display();
		System.out.println(category);
	}
	
}

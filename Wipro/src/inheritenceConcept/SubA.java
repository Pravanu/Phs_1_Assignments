package inheritenceConcept;

public class SubA extends A{

	int price=30;
	public int calculatePrice() {
		int totalPrice = count*price;
		return totalPrice;
	}
	
	public void displaySubA() {
		super.display();
		System.out.println(category);
	}
	
}

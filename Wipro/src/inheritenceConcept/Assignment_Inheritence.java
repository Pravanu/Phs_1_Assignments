package inheritenceConcept;

public class Assignment_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thiis is class A");
		A ob = new A();
		ob.displayA();
		System.out.println();
		
		System.out.println("Thiis is class B");
		B ob1 = new B();
		ob1.displayB();
		System.out.println();
		
		System.out.println("Thiis is class C");
		C ob2 = new C();
		ob2.displayC();
		System.out.println();
		
		System.out.println("Thiis is SubA class");
		SubA ob3 = new SubA();
		ob3.displaySubA();
		System.out.println("Total price = "+ob3.calculatePrice());
		System.out.println();
		
		System.out.println("Thiis is SubB class");
		SubB ob4 = new SubB();
		ob4.displaySubB();
		System.out.println("Total price = "+ob4.calculatePrice());
	}

}

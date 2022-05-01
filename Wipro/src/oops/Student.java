package oops;

public class Student {

	String name;
	int age;
	char section;
	char gender;
	int sub1,sub2,sub3;
	
	public Student( String n,int a,char sec,char g,int sub1,int sub2,int sub3){
		name =n;
		age=a;
		section=sec;
		gender=g;
		sub1=sub1;
		sub2=sub2;
		sub3=sub3;
		
	}
	public int calculateTotal(int sub1,int sub2,int sub3) {
		int total = sub1+sub2+sub3;
		return total;
		
	}
	public int calculatePer(int sub1,int sub2,int sub3) {
		int percentage = ((sub1+sub2+sub3)*100)/300;
		return percentage;
		
	}
	
	 void display()
    {
    	System.out.println(name+" "+age+" "+section+" "+gender);
    }  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Atul",22,'A','M',80,85,78);
		s1.display();
		System.out.println(s1.calculateTotal(80, 85, 78));
		System.out.println(s1.calculatePer(80, 85, 78));
		System.out.println();
		
		Student s2=new Student("Pravanu",22,'B','M',85,85,80);
		s2.display();
		System.out.println(s2.calculateTotal(0, 85, 80));
		System.out.println(s2.calculatePer(0, 85, 80));
		System.out.println();
		
		Student s3=new Student("Soumya",21,'A','M',90,85,82);
		s3.display();
		System.out.println(s3.calculateTotal(0, 85, 82));
		System.out.println(s1.calculatePer(0, 85, 82));
		System.out.println();
		 
		Student s4=new Student("Neha",21,'B','F',86,85,78);
		s4.display();
		System.out.println(s4.calculateTotal(86, 85, 78));
		System.out.println(s4.calculatePer(86, 85, 78));
	}

}

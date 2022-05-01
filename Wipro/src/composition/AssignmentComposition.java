package composition;

import java.util.*;


public class AssignmentComposition {
	
		public static void main(String[] args)
		{
			Employee e1  = new Employee("Arun", 40000 , 25);
			Employee e2  = new Employee("Pravanu", 35000, 22);
			Employee e3  = new Employee("Thiago",50000, 35);
			Employee e4  = new Employee("Varun" ,40000, 27);
			

			// Creating the list which contains the no. of books.
			List<Employee> employee = new ArrayList<Employee>();
			employee.add(e1);
			employee.add(e2);
			employee.add(e3);
			employee.add(e4);
			

			Hr h = new Hr(employee);

			List<Employee> employees = h.getTotalEmployees();
			for (Employee emp : employees) {
				System.out.println("Name : " + emp.name + " Salary : " + emp.salary+" Age : "+emp.age);
			}
		}
	}
	
	


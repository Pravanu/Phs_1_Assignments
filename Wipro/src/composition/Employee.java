package composition;

import java.util.*;

class Employee {
		
	public String name;
	public long salary;
	public int age;
	
	Employee(String name, long salary,int age)
	{
		this.name = name;
		this.salary=salary;
		this.age = age;
	}
}

//Hr class contains list of employees.
class Hr {

	// reference to refer to list of employees.
	private final List<Employee> employees;

	Hr(List<Employee> employees) 
	{ 
		this.employees = employees; 
	}

	
	public  List<Employee> getTotalEmployees()
	{
		return employees;
	}
}





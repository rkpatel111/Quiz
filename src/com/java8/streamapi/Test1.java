package com.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	int id;
	String name;
	String email;
	Integer salary;
	
	
	public Employee(int id, String name, String email, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	
	
	
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Ranjit Kumar Patel", "patel.rk091@gmail.com", 25000));
		empList.add(new Employee(2, "Benjamin Sobel", "ben.min@gmail.com", 30000));
		empList.add(new Employee(3, "Joe George", "joe.grg@gmail.com", 29000));
		empList.add(new Employee(4, "Rajan Kumar Patel", "rajan.patel@gmail.com",15000));
		empList.add(new Employee(5, "Ashwin Kumar Naik", "ashwin.p@gmail.com", 27000));
		
		/*for(Employee emp:empList) {
			if(emp.salary.equals("29000")) {
				System.out.println(emp.salary);
			}
		}
*/	

		List<String> empSalary = (List<String>) empList.stream().filter(n -> n.name.startsWith("R")).map(n -> n.name)
				.collect(Collectors.toList());

		System.out.println(empSalary);

		List<Integer> empIds = empList.stream().filter(f -> f.id % 2 == 0).map(f -> f.id).collect(Collectors.toList());
		System.out.println(empIds);
		
		List<Integer> empSals=empList.stream().filter(n->n.salary<30000).map(n->n.salary).collect(Collectors.toList()); 
		System.out.println(empSals);
	}

}

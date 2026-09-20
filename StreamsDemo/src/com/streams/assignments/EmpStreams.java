package com.streams.assignments;

import java.util.List;
import java.util.NoSuchElementException;

public class EmpStreams {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeDetails.getAllEmployees();
	
		
		//get emp byCIty
		employees.stream().filter(emp-> emp.getCity().equals("Bangalore"))
//		.forEach(emp->System.out.print(emp));
		.forEach(System.out::println);
		
		
		System.out.println("get salary greater than 50000");
		//get salary greater than 50000 
		employees.stream().filter(emp-> emp.getSalary()>90000)
		.map(emp->emp.getEmpName())
		.forEach(System.out::println);
	                             
		System.out.println("get the names in reverse order ");

        employees.stream().map(emp-> emp.getEmpName())
        .sorted((str1, str2) ->str2.compareTo(str1))
        .forEach(System.out::println);
        
		System.out.println();

		System.out.println("get by salary ");
		
		employees.stream()
		.map(emp-> emp.getSalary()).sorted()
		.forEach(System.out::println);
		
//		method2
		employees.stream()
//		.sorted((e1,e2)->((Double)e1.getSalary()).compareTo(e2.getSalary()))
        .sorted((e1, e2) ->Double.compare(e1.getSalary(), e2.getSalary()))
		.forEach(System.out::println);
		System.out.println();

		System.out.println("get by id 101 if not throw exception ");
	Employee emp1=employees.stream()
		.filter(emp->emp.getEmpId()==101)
		.findFirst()
		.orElseThrow(()-> new NoSuchElementException("No Emp Found"));
		System.out.println(emp1.getEmpName());
		
		
		
		
		
		
		
		
	
	
	
	
	
	}
}

package com.streams.assignments;
//Top 20 coding interview questions in Streams API Given a list of employee objects,where each employee has properties:

//empname,empId,city,salary,department

import java.security.Identity;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAssignment {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeDetails.getAllEmployees();

//		1. Find all employees from a specific city and get the count
		System.out.println("1. employees from a specific city");

		long empCount = employees.stream().filter(emp -> emp.getCity().equals("Chennai")).count();
		System.out.println(empCount);
		System.out.println();

//		2. Find all employees where salary is greater than a particular value
		System.out.println("2.employees where salary is greater than");
		employees.stream().filter(emp -> emp.getSalary() > 45000)
				.forEach(emp -> System.out.println(emp.getEmpName() + " " + emp.getSalary()));
		System.out.println();

//		3. Print all the employee names only in upper case and alphabetical order
		System.out.println("3.employee names only in upper case and alphabetical order");
		employees.stream().map(emp -> emp.getEmpName().toUpperCase()).sorted((e1, e2) -> e1.compareTo(e2))
				.forEach(System.out::println);
		System.out.println();

//		4. Get the first employee where dept is "HR" and if not available throw exception
		System.out.println("4.first employee where dept is HR and if not available throw exception");
		Employee empHR = employees.stream().filter(emp -> emp.getDepartment().equals("HR")).findFirst()
				.orElseThrow(() -> new NoSuchElementException("No Emp Found"));
		System.out.println(empHR.getEmpName());
		System.out.println();

//		5. Get the total salary of all employees in a specific department

		System.out.println("5. total salary of all employees in a specific department");
		double empSalarySpecDepart = employees.stream().filter(emp -> emp.getDepartment().equals("IT"))
				.mapToDouble(emp -> emp.getSalary()).sum();
		System.out.println(empSalarySpecDepart);
		System.out.println();

//		6. Check if all employees have a salary greater than a specific Value
		System.out.println("6. Check if all employees have a salary greater than a specific Value");
		boolean empSalarySpecVal = employees.stream().allMatch(emp -> emp.getSalary() >= 40000);
		System.out.println(empSalarySpecVal);
		System.out.println();

//		7. Get the sum of salaries of all employees and the average salary
		System.out.println("7. Get the sum of salaries of all employees and the average salary");
		double empSalaryAllcDepartSum = employees.stream().mapToDouble(emp -> emp.getSalary()).sum();
		System.out.println(empSalaryAllcDepartSum);
		OptionalDouble empSalaryAllcDepartAvg = employees.stream().mapToDouble(emp -> emp.getSalary()).average();
		System.out.println(empSalaryAllcDepartAvg);
		System.out.println();

//		8. Get a Map of Employee Names and their salaries
		System.out.println("8. Get a Map of Employee Names and their salaries");
		employees.stream().forEach(emp -> System.out.println(emp.getEmpName() + " " + emp.getSalary()));
		System.out.println();

//		9. Print the employee details from highest to lowest salary
		System.out.println("9. Print the employee details from highest to lowest salary");
		employees.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.forEach(System.out::println);
		System.out.println();

//		10. Get the employees with the highest salary 
		System.out.println("10. Get the employees with the highest salary ");
		Optional<Employee> empHighSalary = employees.stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).findFirst();
		System.out.println(empHighSalary.get().getEmpName());
		System.out.println();

//		11. Get the employees with the second highest salary 
		System.out.println("11. Get the employees with the second highest salary ");
		Optional<Employee> empSecHighSalary = employees.stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).skip(1).findFirst();
		System.out.println(empSecHighSalary.get().getEmpName());
		System.out.println();

//		12. Get the employees who are earning above the average salary
		System.out.println("12. Get the employees who are earning above the average salary");
		OptionalDouble empSalaryAllDepartAvg = employees.stream().mapToDouble(emp -> emp.getSalary()).average();
		employees.stream().filter(emp -> emp.getSalary() > empSalaryAllDepartAvg.getAsDouble())
				.forEach(emp -> System.out.print(emp.getEmpName() + " : " + emp.getSalary()));
		System.out.println();

//		13. Get the employee with the longest name
		System.out.println("");
		Optional<Employee> longName = employees.stream()
				.max((e1, e2) -> Integer.compare(e2.getEmpName().length(), e1.getEmpName().length()));
		System.out.println(longName.get().getEmpName());
		System.out.println();

//		14.Group all employees by department 
		System.out.println("14.Group all employees by department");
		Map<String, List<Employee>> mapEmp = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		mapEmp.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		System.out.println();

//		15.Get the count of employees by department
		System.out.println("15.Get the count of employees by department");
		Map<String, Long> mapEmpCount = employees.stream()
				.collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));
		mapEmpCount.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		System.out.println();

//		16.Get the sum of salaries of all employees by department
		System.out.println("16.Get the sum of salaries of all employees by department");
		Map<String, Double> mapEmpSalarySum = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
		mapEmpSalarySum.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

		System.out.println();

//		17.Get the average salaries of all employees per department
		System.out.println("17.Get the average salaries of all employees per department");
		Map<String, Double> mapEmpSalaryAvg = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		mapEmpSalaryAvg.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

		System.out.println();

//		18.Check if all employees belong to a specific department
		System.out.println("18.Check if all employees belong to a specific department");
		boolean departCheck = employees.stream().allMatch(emp -> emp.getDepartment().equals("IT"));
		System.out.println(departCheck);
		System.out.println();

//		19.List all employees grouping by cities but belong to the same department
		System.out.println("19.List all employees grouping by cities but belong to the same department");
		Map<String, Map<String, List<Employee>>> mapEmpCityAndDepart = employees.stream()
				.collect(Collectors.groupingBy(Employee::getCity, Collectors.groupingBy(Employee::getDepartment)));
		mapEmpCityAndDepart.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		System.out.println();

//		20.Find the department with the highest average salary
		System.out.println("20.Find the department with the highest average salary");
		mapEmpSalaryAvg = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Entry<String, Double> highSalaryDept = mapEmpSalaryAvg.entrySet().stream().max(Map.Entry.comparingByValue())
				.get();
		System.out.println(highSalaryDept.getKey() + " : " + highSalaryDept.getValue());
		System.out.println();

	}

}

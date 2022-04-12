package com.designpatterns.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder(101, "Ramesh", "Gupta").middleName("Kumar").age(34)
				.gender(Gender.MALE).salary(5000).build();
		System.out.print(employee);
	}

}

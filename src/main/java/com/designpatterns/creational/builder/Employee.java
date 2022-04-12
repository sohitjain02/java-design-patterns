package com.designpatterns.creational.builder;

public class Employee {

	private final int employeeId; // Mandatory field

	private final String firstName; // Mandatory field

	private final String middleName;

	private final String lastName; // Mandatory field

	private final int age;

	private final Gender gender;

	private final double salary;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", salary=" + salary + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	private Employee(EmployeeBuilder builder) {
		this.employeeId = builder.employeeId;
		this.firstName = builder.firstName;
		this.middleName = builder.middleName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.gender = builder.gender;
		this.salary = builder.salary;
	}

	public static class EmployeeBuilder {
		private final int employeeId; // Mandatory field

		private final String firstName; // Mandatory field

		private String middleName;

		private final String lastName; // Mandatory field

		private int age;

		private Gender gender;

		private double salary;

		public EmployeeBuilder(int employeeId, String firstName, String lastName) {
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public EmployeeBuilder middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder gender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeBuilder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			Employee employee = new Employee(this);
			return employee;
		}
	}

}

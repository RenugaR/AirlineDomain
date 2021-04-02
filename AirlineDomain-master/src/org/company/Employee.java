package org.company;
//Child class
public class Employee extends Company{
	
	public void empName() {
		System.out.println("Emp name is Raja");
	}
	
	public void empId() {
		System.out.println("Emp id is 12345");
	}
	
	public void empAge() {
		System.out.println("Emp age is 55");
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.giftVocher();
		e.empAge();
		e.empId();
		e.empName();
		e.transport();
		e.shiftAllowance();
	}
	
}

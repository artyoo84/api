package oop02.encapsule;

public class PayVO {
	private int salary, income; // 월급
	private String name;
	static final double TAX = 0.1; // 상수(세금) 클래스 변수 
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	
	
	
}

package oop01.encapsule;

public class PayService {
	
	PayVO vo = new PayVO();
	
	public void salary(int salary) {
		vo.setSalary(salary);
	}
	
	public void name(String name){
		vo.setName(name);
	}
	
	public double calculation() {
		double income = vo.getSalary() - taxer();
		vo.setIncome((int)income);
		return income;
	}
	
	public double taxer() {
		
		double tax1 = vo.getSalary() * 0.1;
		
		return tax1;		
	}
	
}

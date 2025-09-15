package Private;

public class EmployeeSalary {
	
	//public double salary;
	
//	EmployeeSalary(double salary){
//		this.salary = salary;
//	}
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			System.out.println("Employee's salary is:" +salary);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary emSalary = new EmployeeSalary();
		//emSalary.salary = 50000;
		//emSalary.salary = -5000; 
		emSalary.setSalary(-7000);
		emSalary.setSalary(7000);
		emSalary.getSalary();
		//System.out.println("Employee's salary is:" +emSalary.salary);
	}

}
package methodConstructor;

public class salaryManagement {

	String id;
	String name;
	double basicSalary;

	salaryManagement(String id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	double calculateHRA() {
		double hra = (basicSalary * 0.2);
		//System.out.println("HRA is " + hra);
		return hra;
	}

	double calculateDA() {
		double da = (basicSalary * 0.1);
		//System.out.println("DA is " + da);
		return da;
	}

	double calculateNetSalary() {
		double grossSalary = (calculateHRA() + calculateDA() + basicSalary);
		System.out.println("grosssalary is " + grossSalary);
		return grossSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salaryManagement sm = new salaryManagement("2524165", "Snejuti", 14800.67);
		System.out.println("HRA is:" + sm.calculateHRA());
		System.out.println("DA is " +sm.calculateDA());
		sm.calculateNetSalary();
	}

}
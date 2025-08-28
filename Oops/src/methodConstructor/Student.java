package methodConstructor;

public class Student {
	
	int id;
	String name;
	String phNo;
	String add;
	double marks;
	//String section;
	
	Student(int id,String name,String phNo, String add, double marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.add = add;
		//this.section = section;
	}
	public void studentPersonalDetails() {
		System.out.println("Student id is: " +id);
		System.out.println("Student name is: " +name);
		System.out.println("Student add is: " +add);
		
	}
	void studentAcademicDetails() {
		System.out.println("Student id is: " +id);
		System.out.println("Student name is: " +name);
		System.out.println("Student marks is: " +marks);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student su1 = new Student(21,"Snejuti","8927490596","Balurghat",98.90);
		Student su2 = new Student(10,"Soumyajit","8167711489","Kolkata",95.90);
		Student su3 = new Student(11,"Saurav","7384403001","Bihar",95.80);
		su1.studentPersonalDetails();
		su1.studentAcademicDetails();
		su2.studentPersonalDetails();
		su2.studentAcademicDetails();
		su3.studentAcademicDetails();
		su3.studentPersonalDetails();
	}

}
package Inheritance;

public class Vehicle {
	String brands;
	String speed;
	
	Vehicle(String brands,String speed){
		this.brands = brands;
		this.speed = speed;
	}
	Vehicle(String brands){
		this.brands = brands;
	}
	void vehicleDetails(){
		if(brands == "Marceedes") {
			System.out.println("India 1st top brand car");
		}
		else if(brands == "BMW") {
			System.out.println("India 2nd top brand car");
		}
		else if(brands == "Audi") {
			System.out.println("Another top branded car");
		}
	}
	
}
class Car extends Vehicle{
	String model;
	
	Car(String brands,String speed,String model){
		super(brands,speed);
		this.model = model;
		
	}
	void display() {
		System.out.println("Car brand name is: " +super.brands);
		System.out.println("Car speed is:" +super.speed);
		System.out.println("Car model name is:" +model);
	}

public static void main(String[] args) {
	Car ca = new Car("BMW","22/km","bnk");
	Vehicle veh = new Vehicle("Marceedes");
	ca.display();
	veh.vehicleDetails();
}
}
package Abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Amphi = new Amphibian("Frog");
		Amphi.name();
		Amphi.livingPlace();
		
		Animal Aqua = new Aquatic("Snake");
		Aqua.name();
		Aqua.livingPlace();
		
		Animal Terr = new Terrestrial("Dog");
		Terr.name();
		Terr.livingPlace();
	}

}

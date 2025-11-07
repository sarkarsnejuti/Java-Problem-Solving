package simpleGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player1 pl1 = new Player1("Snejuti", "MP03", -60);
		System.out.println("1st Player name is: " + pl1.getName());
		System.out.println("Injured by: " + pl1.getWeapon());
		System.out.println("Recovery percentage is: " + pl1.getInjured());
		pl1.damageByGun2();

		Player2 pl2 = new Player2("Saurav", "Knief", 278, true);
		pl2.damageByGun();

		Player2 pl3 = new Player2("Saurav", "Knief", 278, false);
		pl3.damageByGun();

	}

}

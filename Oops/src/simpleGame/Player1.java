package simpleGame;

public class Player1 {
	private String name;
	private String weapon;
	private int injured;

	Player1(String name, String weapon, int injured) {
		this.name = name;
		this.weapon = weapon;
		// this.injured = injured;
		if (injured > 0 && injured < 100) {
			this.injured = injured;
		} else if (injured > 100) {
			this.injured = 100;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getInjured() {
		return injured;
	}

	public void setInjured(int injured) {
		this.injured = injured;
	}

	public void damageByGun() {
		this.injured = this.injured - 30;
		if (this.injured <= 0) {
			this.injured = 0;
		}
		if (this.injured == 0) {
			System.out.println(getName() + " is dead");
		} else {
			System.out.println("Hit by gun. Injured by 30 and " + " Save percentage is " + this.injured);
		}
	}

	public void damageByGun2() {
		this.injured = this.injured - 50;
		if (this.injured <= 0) {
			this.injured = 0;
		}
		if (this.injured == 0) {
			System.out.println(getName() + " is dead");
		} else {
			System.out.println("Hit by gun. Injured by 50 and " + " Save percentage is " + this.injured);
		}
	}

}

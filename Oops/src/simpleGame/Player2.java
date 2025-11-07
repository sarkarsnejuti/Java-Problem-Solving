package simpleGame;

public class Player2 extends Player1 {

	private boolean armour;
	private int injured;

	Player2(String name, String weapon, int injured, boolean armour) {
		super(name, weapon, injured);
		this.armour = armour;
		this.injured = injured;
		if (injured > 0 && injured < 100) {
			this.injured = injured;
		} else if (injured > 100) {
			this.injured = 100;
		}

	}

	@Override
	public void damageByGun() {
		if (armour) {
			this.injured = this.injured - 30;
			if (this.injured <= 0) {
				this.injured = 0;
			}
			if (this.injured == 0) {
				System.out.println(getName() + " is dead");
			} else {
				System.out.println("Hit by armour. Injured by 30 and " + " Save percentage is " + this.injured);
			}
		}
		if (!armour) {
			this.injured = this.injured - 70;
			if (this.injured <= 0) {
				this.injured = 0;
			}
			if (this.injured == 0) {
				System.out.println(getName() + " is dead");
			} else {
				System.out.println("Armour is off. Injured by 70 and " + " Save percentage is " + this.injured);
			}
		}

	}

}

package pizzaBillGenerator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pi = new Pizza(true);
//		pi.getPizzaPrice();
		pi.extraCheese();
//		pi.addExtraTopping();
		pi.takeAway();
		pi.getBill();
		
		DeluxePizza dp = new DeluxePizza(false);
		//dp.extraCheese();
		//dp.addExtraTopping();
		dp.takeAway();
		dp.getBill();
	}

}

package pizzaBillGenerator;

public class Pizza {
	private int price;
	
	private boolean veg = true;
	private int extraCheesePrice = 100;
	private int extraToppingPrice = 150;
	private int takeAwayPrice = 20;
	
	private boolean isExtraCheesePrice = false;
	private boolean isExtraToppingPrice = false;
	private boolean isBagPrice = false;
	
	private int basePizzaPrice;
	
	Pizza(boolean veg){
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		
		basePizzaPrice = this.price;
	}
	
//	public void getPizzaPrice() {
//		System.out.println("Pizza price is:"+ this.price);
//	}
 
	public void extraCheese() {
		isExtraCheesePrice = true;
		this.price += extraCheesePrice;
		
	}
	public void addExtraTopping() {
		isExtraToppingPrice = true;
		this.price += extraToppingPrice;
	}
	public void takeAway() {
		isBagPrice = true;
		this.price += takeAwayPrice;
	}
	public void getBill() {
		System.out.println("Pizza price is: " +basePizzaPrice);
		String bill = "";
		if(isExtraCheesePrice) {
			bill += "Extra cheese added:" +extraCheesePrice+ "\n";
		}
		if(isExtraToppingPrice) {
			bill += "Extra topping added:" +extraToppingPrice+ "\n";
		}
		if(isBagPrice) {
			bill += "Take away:" +takeAwayPrice+ "\n";
		}
		
		bill += "Bill price:" +this.price+ "\n";
		System.out.println(bill);
	}
}

package pizzaBillGenerator;

public class DeluxePizza extends Pizza{

	DeluxePizza(boolean veg) {
		super(veg);
		super.extraCheese();
		super.addExtraTopping();
		
	}

	@Override
	public void extraCheese() {}

	@Override
	public void addExtraTopping() {}
	
}

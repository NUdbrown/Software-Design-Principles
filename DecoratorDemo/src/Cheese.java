
public class Cheese extends Toppings{

	public Cheese(IPizza pizza) {
		super(pizza);
	}

	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Cheese " + super.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost() + 0.50;
	}
}

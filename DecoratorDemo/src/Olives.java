
public class Olives extends Toppings {

	public Olives(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String getDescription() {
		return "Olives " + super.getDescription();
	}

	@Override
	public double cost() {
		return super.cost() + 0.50;
	}
	
}

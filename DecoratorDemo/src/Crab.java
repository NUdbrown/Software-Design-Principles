
public class Crab extends Toppings{

	public Crab(IPizza pizza){
		super(pizza);
	}
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Crab " + super.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost() + 10.50;
	}
}

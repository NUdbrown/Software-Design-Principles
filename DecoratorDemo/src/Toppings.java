
public abstract class Toppings implements IPizza{
	private IPizza pizza;
	
	public Toppings(IPizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

	@Override
	public double cost() {
		return pizza.cost();
	}

}

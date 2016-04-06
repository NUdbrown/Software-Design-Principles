
public class Pizza implements IPizza {
	private double cost;
	
	public Pizza(){
		this(2.99);
	}

	public Pizza(double cost){
		this.cost = cost;
	}
	
	@Override
	public String getDescription() {	
		return "Pizza";
	}

	@Override
	public double cost() {		
		return cost;
	}

}
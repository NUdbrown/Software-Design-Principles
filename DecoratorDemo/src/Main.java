
public class Main {

	public static void main(String[]args){
		IPizza p1 = new Olives(new Pizza());
		IPizza p2 = new Cheese(new Pizza());
		IPizza p3 = new Crab(new Pizza());
		IPizza p4 = new Crab(p1);
		IPizza p5 = new Cheese(p2);		
		
		System.out.println(p1.getDescription() + " " + p1.cost());
		System.out.println(p2.getDescription() + " " + p2.cost());
		System.out.println(p3.getDescription() + " " + p3.cost());
		System.out.println(p4.getDescription() + " " + p4.cost());
		System.out.println(p5.getDescription() + " " + p5.cost());
	}
}


public class SmashBros implements GameCommand {
	private TVScreen screen;
	
	public SmashBros(TVScreen screen){
		this.screen = screen;
	}
	
	@Override
	public void runGame() {
		screen.displayGame("SuperSmash Bros!!");
		
	}
	

}

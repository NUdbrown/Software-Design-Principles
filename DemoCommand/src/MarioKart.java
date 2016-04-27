
public class MarioKart implements GameCommand {
	
	private TVScreen screen;
	
	public MarioKart(TVScreen screen){
		this.screen = screen;
	}

	@Override
	public void runGame() {
		screen.displayGame("Mario Kart !");
		
	}
	
	
	

}

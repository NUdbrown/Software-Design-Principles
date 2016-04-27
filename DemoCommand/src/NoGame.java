
public class NoGame implements GameCommand{
	private TVScreen screen;
	
	public NoGame(TVScreen screen){
		this.screen = screen;
	}

	@Override
	public void runGame() {
		screen.displayGame("There is no game!");
		
	}

}

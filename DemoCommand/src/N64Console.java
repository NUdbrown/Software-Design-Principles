
public class N64Console { //invoker
	private GameCommand command;
	
	public N64Console(GameCommand command){
		this.command = command;
	}
	
	public void powerOn(){
		command.runGame();
	}

	public void insertGame(GameCommand newGame){
		this.command = newGame;
	}
}

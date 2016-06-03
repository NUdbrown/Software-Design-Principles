package main;
public class Controller {
	private Model model;
	
	public Controller(Model model){
		this.model = model;
	}
	
	//need switch to determine the keys and what to do with them.
	//cases: if char , backspace, left or right cursor, undo and redo
	public void sendCharsInt(int keyPress) {
		final int backspace = 8;
		final int leftArrow = 17;
		final int rightArrow = 19;
		final int undo = 45;
		final int redo = 43;
		final int randomChar = 63;
		CommandParser command = null;
		
		if(keyPress == undo){
			model.undo();
		}else if (keyPress == redo){
			model.redo();
		}else if(keyPress == randomChar){
			command = new InsertCommand(model, RandomNumberGenerator.getInstance().getRandomChar());			
		}
		else{
			switch(keyPress){
			case backspace:
				command = new BackspaceCommand(model);
				break;
			case leftArrow:
				command = new MoveLeftCommand(model);
				break;
			case rightArrow:
				command = new MoveRightCommand(model);
				break;
			default:
				command = new InsertCommand(model, keyPress);
				break;
			}			
		}
		command.execute();
		
	}

}

package main;

public class MoveRightCommand implements CommandParser {

private Model model;
	
	public MoveRightCommand(Model model) {
		this.model = model;
	}
	
	@Override
	public void execute() {
		model.moveRight();
	}

}

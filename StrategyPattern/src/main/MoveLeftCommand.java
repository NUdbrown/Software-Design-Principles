package main;

public class MoveLeftCommand implements CommandParser {
	private Model model;
	
	public MoveLeftCommand(Model model) {
		this.model = model;
	}
	
	@Override
	public void execute() {
		model.moveLeft();
	}

}

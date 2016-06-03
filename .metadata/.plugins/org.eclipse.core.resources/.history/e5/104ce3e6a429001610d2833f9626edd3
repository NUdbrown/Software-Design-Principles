package main;

public class UndoCommand implements CommandParser {
	private Model model;
	
	public UndoCommand(Model model) {
		this.model = model;
	}
	
	@Override
	public void execute() {
		model.undo();
	}

}

package main;

public class InsertCommand implements CommandParser {
	private Model model;
	private int insertThis;
	
	public InsertCommand(Model model, int insertThis) {
		this.model = model;
		this.insertThis = insertThis;
	}
	
	@Override
	public void execute() {
		model.insertChar(insertThis);
	}

}

public class Controller {
	private Model model;
	
	public Controller(Model model){
		this.model = model;
	}
		
	//cases: if char , backspace, left or right cursor
	public void sendCharsInt(int keyPress) {
		final int backspace = 8;
		final int leftArrow = 17;
		final int rightArrow = 19;
		
		switch(keyPress){
		case backspace:
			model.deleteLeft();
			 break;
		case leftArrow:
			model.moveLeft();
			break;
		case rightArrow:
			model.moveRight();
			break;
		default:
			model.insertChar(keyPress);
			break;
		}		
	}

}

import edu.neumont.csc415.Desktop;

public class View implements IModelObserver{
	
	private Controller controller;
	
	public View(Controller controller){
		this.controller = controller;
	}
	
	
	public void showView(){
		Desktop desktop = new Desktop(800,800);
		Window window = new Window(desktop);
		desktop.registerPaintable(window);
		Keyboard keyboard = new Keyboard(desktop);
		keyboard.registerObserver(controller);
		keyboard.pollKeyboard();
	}

	@Override
	public void update(char c) {
				
	}
	
//	public static void main(String [] args){
//		Model model = new Model();
//		Controller controller = new Controller(model);
//		View view = new View(controller);
//		view.registerObserver(model);
//		view.showView();
//		//need switch to determine the keys and what to do with them.	
//		
//	}
	
}
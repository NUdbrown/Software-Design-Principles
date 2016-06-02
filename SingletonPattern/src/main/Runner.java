package main;
import edu.neumont.csc415.Desktop;

public class Runner {
	
	public static void main(String [] args){
		Model model = new Model();
		Controller controller = new Controller(model);
		Desktop desktop = new Desktop(800,800);
		Window window = new Window(desktop, model);
		desktop.registerPaintable(window);
		model.registerObserver(window);
		Keyboard keyboard = new Keyboard(desktop);
		keyboard.registerObserver(controller);
		keyboard.pollKeyboard();
	
	}

}

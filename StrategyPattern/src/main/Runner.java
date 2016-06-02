package main;
import edu.neumont.csc415.Desktop;

public class Runner {
	
	public static void main(String [] args){
		Desktop desktop = new Desktop(800,800);
		Model model = new Model();
		Window window = new Window(desktop, model);
		Controller controller = new Controller(model, window);
		desktop.registerPaintable(window);
		model.registerObserver(window);
		Keyboard keyboard = new Keyboard(desktop);
		keyboard.registerObserver(controller);
		keyboard.pollKeyboard();
	
	}

}

package main;

import edu.neumont.csc415.Desktop;

public class Controller {
	
	public static void main(String [] args) throws InterruptedException{
		Desktop desktop = new Desktop(800,800);
		Window window = new Window(desktop);
		desktop.registerPaintable(window);
		Keyboard keyboard = new Keyboard(desktop);
		keyboard.registerObserver(window);
		keyboard.pollKeyboard();
	
		
	}

}

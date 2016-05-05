package main;

import edu.neumont.csc415.Desktop;

public class Controller {
	
	public static void main(String [] args) throws InterruptedException{
		Desktop desktop = new Desktop(800,800);
		Window window = new Window(desktop);
		Title title = new Title(desktop, window, "TextEditor");
		Border border = new Border(title);
		Keyboard keyboard = new Keyboard(desktop);
		desktop.registerPaintable(border);
		keyboard.registerObserver(window);
		keyboard.pollKeyboard();
		
		
		
	}

}

package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import edu.neumont.csc415.Desktop;

public class Controller {
	
	public static void main(String [] args) throws InterruptedException{
		Desktop desktop = new Desktop(800,800);
		File filename = new File("real.txt");
		WindowFactory factory = new WindowFactory(desktop);
		Title title = new Title(desktop,factory.createWindow(), "TextEditor");
		Border border = new Border(title);
		desktop.registerPaintable(border);
		
		try {
			if(factory.chooseTypeOfWindow(filename)){
				Keyboard keyboard = new Keyboard(desktop);
				keyboard.registerObserver(factory.createWindow());
				keyboard.pollKeyboard();
			}else{
				MockKeyboard mock = new MockKeyboard(desktop, factory.createWindow());
				mock.pollKeyboard();
			}
		} catch (IOException e) {
			System.out.println("The file wasn't found or something is wrong with the file");
			e.printStackTrace();
			e.getMessage();
		}
		
		//Keyboard keyboard = new Keyboard(desktop);
		//keyboard.registerObserver(window);
		//keyboard.pollKeyboard();
		
		
	}

}

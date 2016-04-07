package main;

import edu.neumont.csc415.Desktop;
import edu.neumont.csc415.IPaintable;

public class Controller {
	
	public static void main(String [] args){
		Desktop desktop = new Desktop(1000,1000);
		IPaintable paintable = new Window();
		desktop.registerPaintable(paintable);
		desktop.repaint();
	}

}

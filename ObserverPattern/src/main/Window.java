package main;

import edu.neumont.csc415.DesktopColor;
import edu.neumont.csc415.DesktopGraphics;
import edu.neumont.csc415.IPaintable;
import edu.neumont.csc415.Point;

public class Window implements IPaintable, IWindow{

	public Window() {	
		
	}

	@Override
	public void paint(DesktopGraphics arg0) {
		Point topLeft = new Point(100, 300);
		Point bottomRight = new Point(600, 0);
		arg0.fillRectangle(topLeft,bottomRight , DesktopColor.LIGHT_GRAY);	
		
		//paint the chars into the rectangle [left to right, start at topLeft corner]
	}

	@Override
	public void update() {
		
		
	}


	
	
}

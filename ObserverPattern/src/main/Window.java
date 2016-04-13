package main;

import java.util.ArrayList;
import java.util.List;

import edu.neumont.csc415.Desktop;
import edu.neumont.csc415.DesktopColor;
import edu.neumont.csc415.DesktopGraphics;
import edu.neumont.csc415.IPaintable;
import edu.neumont.csc415.Point;

public class Window implements IPaintable, Observer{
 //Have the window draw the window as a simple colored rectangle. [check] 
//Register a controller class with the window to receive keystrokes and place 
	//the corresponding characters in the window.

	private List<Character> theChars = new ArrayList<Character>();
	private DesktopGraphics dgraphics;
	private Desktop desktop;
	
	public Window(Desktop desktop) {	
		this.desktop = desktop;
	}

	@Override
	public void paint(DesktopGraphics arg0) {
		this.dgraphics = arg0;
		Point topLeft = new Point(100,300);
		Point bottomRight = new Point(600, 0);
		//char width & height
		arg0.fillRectangle(topLeft,bottomRight , DesktopColor.LIGHT_GRAY);	
		
		for(char c : theChars){
			int y = 300 + desktop.getCharWidth(c) + 20;
			int x = 100 + desktop.getCharHeight();
			Point charPosition = new Point(x,y);
			arg0.drawChar(c, charPosition, DesktopColor.MAGENTA);
						
		}
		
		//char relative to window topleft		
		//paint the chars into the rectangle 
		//[left to right, start at topLeft corner]
	}

	//take in char , send to list
	@Override
	public void update(char c) {	
		theChars.add(c);
		paint(dgraphics);
		System.out.println("This is from the update()" + c);
		
	}


	
	
}

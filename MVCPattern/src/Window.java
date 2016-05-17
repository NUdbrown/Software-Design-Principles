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
	private final int WIDTH = 100;
	private final int HEIGHT = 600;
	private char[][] characters = new char[WIDTH][HEIGHT];
	
	
	public Window(Desktop desktop) {	
		this.desktop = desktop;
	}

	@Override
	public void paint(DesktopGraphics arg0) {
		this.dgraphics = arg0;
		Point topLeft = new Point(WIDTH,300);
		Point bottomRight = new Point(HEIGHT, 0);
		//char width & height
		int x = 90, y =320;
		arg0.fillRectangle(topLeft,bottomRight , DesktopColor.LIGHT_GRAY);	
		
		for(char c : theChars){
			if(x >= 580){
				y = y + desktop.getCharHeight();
				x = 100;
			}
			else{
				x += desktop.getCharWidth(c);
			}
			Point charPosition = new Point(x,y);				
			arg0.drawChar(c, charPosition, DesktopColor.MAGENTA);
			
		}
		
		//fill in the chars in the 2D
		
		
	}

	
	//take in char , send to list
	@Override
	public void update(char c) {	
		theChars.add(c);
		paint(dgraphics);
		System.out.println("This is from the update()" + c);
		
	}


	
	
}

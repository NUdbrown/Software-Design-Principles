package main;

import java.util.ArrayList;
import java.util.List;

import edu.neumont.csc415.Desktop;
import edu.neumont.csc415.DesktopColor;
import edu.neumont.csc415.DesktopGraphics;
import edu.neumont.csc415.IPaintable;
import edu.neumont.csc415.Point;

public class Window implements IWindow, Observer {
	// Have the window draw the window as a simple colored rectangle. [check]
	// Register a controller class with the window to receive keystrokes and
	// place
	// the corresponding characters in the window.

	private List<Character> theChars = new ArrayList<Character>();
	private DesktopGraphics dgraphics;
	private Desktop desktop;
	private int width;
	private int height;

	public Window(Desktop desktop) {
		this.desktop = desktop;
		setWidth(100);
		setHeight(600);
	}

	@Override
	public void paint(DesktopGraphics arg0) {
		this.dgraphics = arg0;
		Point topLeft = new Point(100, 300);
		Point bottomRight = new Point(600, 0);
		// char width & height
		int x = 90, y = 320;
		arg0.fillRectangle(topLeft, bottomRight, DesktopColor.LIGHT_GRAY);

		for (char c : theChars) {
			if (x >= 580) {
				y = y + desktop.getCharHeight();
				// y = y + 15;
				x = 100;
			} else if (y == 0) {

			} else {
				x += desktop.getCharWidth(c);
			}
			Point charPosition = new Point(x, y);
			arg0.drawChar(c, charPosition, DesktopColor.MAGENTA);

		}

		// char relative to window topleft
		// paint the chars into the rectangle
		// [left to right, start at topLeft corner]
	}

	// take in char , send to list
	@Override
	public void update(char c) {
		theChars.add(c);
		desktop.repaint();
		//System.out.println("This is from the update()" + c);

	}

	public int getWidth() {
		return width;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	private void setHeight(int height) {
		this.height = height;
	}

}

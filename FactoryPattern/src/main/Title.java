package main;

import edu.neumont.csc415.Desktop;
import edu.neumont.csc415.DesktopColor;
import edu.neumont.csc415.DesktopGraphics;
import edu.neumont.csc415.Point;

public class Title implements IWindow {
	private IWindow win;
	private String title;
	private int width;
	private int height;
	private Desktop desktop;
	
	public Title(Desktop desktop, IWindow win, String title){
		this.win = win;
		this.title = title;
		this.desktop = desktop;
		setWidth(260);
		setHeight(0);
	}
	
	@Override
	public void paint(DesktopGraphics arg0){
		Point topLeft = new Point(win.getWidth(), width);
		Point bottomRight = new Point(win.getHeight(), height);
		arg0.fillRectangle(topLeft, bottomRight, DesktopColor.BLUE);
		//for each char in the title, print them side by side
		int x = (topLeft.getX() + 10);
		int y = topLeft.getY() + 25;
		for(char c : title.toCharArray()){
			Point putCharHere = new Point(x,y);
			arg0.drawChar(c, putCharHere, DesktopColor.WHITE);
			x += desktop.getCharWidth(c);
		}
		
		win.paint(arg0);
		
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

package main;

import edu.neumont.csc415.DesktopColor;
import edu.neumont.csc415.DesktopGraphics;
import edu.neumont.csc415.Point;

public class Border implements IWindow {

	private IWindow win;
	private int width;
	private int height;
	
	public Border(IWindow win){
		this.win = win;
		setWidth(90);
		setHeight(610);
		
	}
	

	@Override
	public void paint(DesktopGraphics arg0) {
		Point topLeft = new Point(width, (win.getWidth() - 10));
		Point bottomRight = new Point(height, win.getHeight() - 110);
//		System.out.println("topleft: " + topLeft.getX() + ", " + topLeft.getY());
//		System.out.println("bottomRight: " + bottomRight.getX() + ", " + bottomRight.getY());
		arg0.fillRectangle(topLeft, bottomRight,DesktopColor.BLACK);
		win.paint(arg0);
	}

	@Override
	public int getWidth() {		
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getHeight() {		
		return win.getHeight();
	}


	public void setHeight(int height) {
		this.height = height;
	}



}

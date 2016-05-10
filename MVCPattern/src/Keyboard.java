

import java.util.ArrayList;
import java.util.List;

import edu.neumont.csc415.Desktop;

public class Keyboard{
	private Desktop dtop;
	private List<Window> listOfWindows = new ArrayList<Window>();

	
	public Keyboard(Desktop dtop){
		this.dtop = dtop;
		
	}
	
	public void registerObserver(Window win){
		listOfWindows.add(win);
	}
	
	public void notifyObserver(char c){
		for(Window win : listOfWindows){		
			win.update(c);
		}
	}
	
	public void pollKeyboard(){
		//wait for input
		//hold whatever is pressed and send it to the window
		boolean running = true;
		while(running){
			while(dtop.hasKeysQueued()){
				char key = (char)dtop.getKeyCode();
				System.out.println("this is from pollkeyboard()" + key);			
				notifyObserver(key);
				dtop.repaint();				
				
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
			
	}
	

}



import java.util.ArrayList;
import java.util.List;

import edu.neumont.csc415.Desktop;

public class Keyboard{
	private Desktop desktop;
	private List<Controller> listOfControllers = new ArrayList<Controller>();

	
	public Keyboard(Desktop desktop){
		this.desktop = desktop;
		
	}
	
	public void registerObserver(Controller controller){
		listOfControllers.add(controller);
	}
	
	public void notifyObserver(int key){
		for(Controller controller : listOfControllers){		
			controller.sendCharsInt(key);
		}
	}
	
	public void pollKeyboard(){
		//wait for input
		//hold whatever is pressed and send it to the window
		boolean running = true;
		while(running){
			while(desktop.hasKeysQueued()){
				int key = (int)desktop.getKeyCode();
				System.out.println("this is from pollkeyboard()" + key);			
				notifyObserver(key);
				//desktop.repaint();				
				
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
			
	}
	

}

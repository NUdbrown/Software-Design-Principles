package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import edu.neumont.csc415.Desktop;

//what is involved in creating a window
//paint method
//the keyboard
public class WindowFactory{
	private Desktop desktop;
	private Window window;
	
	public WindowFactory(Desktop desktop){
		this.desktop = desktop;
		window = new Window(desktop);
	}
	
	public boolean chooseTypeOfWindow(File filename) throws FileNotFoundException {

		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String fileLine = null;
		try {
			fileLine = reader.readLine();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileLine.equals("real");		
	}
		
	public Window createWindow(){
		return window;
	}
	//how to connect Keyboard if Keyboard happens in controller ?
	
//	public Window createWindow(Desktop desktop){
//		Window win = new Window(desktop);
//		
//		try {
//			if(chooseTypeOfWindow()){
//				Keyboard keyboard = new Keyboard(desktop);
//				keyboard.registerObserver(win);
//				keyboard.pollKeyboard();
//				
//			}else{
//				MockKeyboard mock = new MockKeyboard(desktop, win);	
//				mock.pollKeyboard();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return win;
//		
//	}

}
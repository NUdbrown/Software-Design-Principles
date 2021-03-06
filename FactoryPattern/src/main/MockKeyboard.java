package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import edu.neumont.csc415.Desktop;

public class MockKeyboard {
	private Desktop desktop;
	private Window win;
	
	public MockKeyboard(Desktop desktop, Window win){
		this.desktop = desktop;
		this.win = win;
	}
	
	public void notifyObserver(char c){		
			win.update(c);		
	}
	
	public void pollKeyboard() throws IOException{
//		BufferedReader reader = new BufferedReader(new FileReader("FakeKeyboard.txt"));
//		
//		while(reader.ready()){
//			//read from file, get each char and print it on desktop.
//				char key = (char) reader.read();
//				//System.out.println("this is from pollkeyboard()" + key);			
//				notifyObserver(key);
//				desktop.repaint();
//
////			try {
////				Thread.sleep(5);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
//		
//		}
//		
//		reader.close();
		
			Scanner scanner = new Scanner(new BufferedReader(new FileReader("FakeKeyboard.txt")));
            while (scanner.hasNext())
            {
              
            	String line = scanner.nextLine();
            	
            	for(char key: line.toCharArray()){
            		notifyObserver(key);
            	}
                
            }
            
            scanner.close();
        
		
		
		
		
	}


}

import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Characters;

import edu.neumont.csc415.Desktop;

public class Model {
	private List<Character> leftOfCursor = new ArrayList<Character>();
	private List<Character> rightOfCursor = new ArrayList<Character>();
	private List<IModelObserver> listOfObservers = new ArrayList<IModelObserver>();
	
	/**To move the cursor one character to the left,
	 *  pop the left list and push the result onto the right list.
	 *  
	 *  to add a char to the screen it goes on the left side
	 */
	
	public void registerObserver(IModelObserver observer){
		listOfObservers.add(observer);
	}
	
	public void notifyObserver(){
		for(IModelObserver observer : listOfObservers){		
			observer.update();
		}
	}
	
	public void insertChar(int key){
		//place char to the left of the cursor
		char c = (char) key;
		//add to left list
		leftOfCursor.add(c);
		notifyObserver();
	}
	
	public void deleteLeft(){
		//delete the char on the left side of the cursor
		
		leftOfCursor.remove(leftOfCursor.size() - 1);
		notifyObserver();
		
	}
	
	public void deleteRight(){
		//delete the char to the right of the cursor
		rightOfCursor.remove(0);
		notifyObserver();

	}
	
	public void moveLeft(){
		//move the cursor to the left 
		//take the last char from the left list and move it to the right list
		if(leftOfCursor.size() != 0){
			int lastIndex = (leftOfCursor.size() - 1);
			char movingKey = leftOfCursor.get(lastIndex);
			rightOfCursor.add(movingKey);
			leftOfCursor.remove(lastIndex);
			notifyObserver();
		}
		
	}
	public void moveRight(){
		//move the cursor to the right
		//take the first char from the right list and move it to the left list
		if(rightOfCursor.size() != 0){
			char movingKey = rightOfCursor.get(0);
			leftOfCursor.add(movingKey);
			rightOfCursor.remove(0);	
			notifyObserver();
		}
	}

	public List<Character> getAllTheCharacters() {
		List<Character> allTheCharacters = new ArrayList<Character>();
		
		for(char c: leftOfCursor){
			allTheCharacters.add(c);			
		}
		for(char c : rightOfCursor){
			allTheCharacters.add(c);
		}
		return allTheCharacters;
	}
	
	
//	public static void main (String[] args){
//		Model model = new Model();
//		Controller control = new Controller(model);
//		control.sendCharsInt(55);
//		control.sendCharsInt(78);
//		control.sendCharsInt(65);
//		control.sendCharsInt(101);
//		control.sendCharsInt(19);
//		control.sendCharsInt(8);
//		control.sendCharsInt(67);
//		control.sendCharsInt(121);
//		control.sendCharsInt(19);
//		control.sendCharsInt(88);
//		control.sendCharsInt(95);
//		//control.sendCharsInt(17);
//		control.sendCharsInt(17);
//		control.sendCharsInt(112);
//		control.sendCharsInt(130);
//		control.sendCharsInt(8);
//		
//		for(char c : model.leftOfCursor){
//			System.out.println("Left of cursor:" + c);
//		}
//		
//		for(char c : model.rightOfCursor){
//			System.out.println("Right of cursor: " + c);
//		}
//		
//	}
	
}

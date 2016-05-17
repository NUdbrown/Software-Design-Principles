import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Characters;

public class Model implements Observer{
	private List<Character> leftOfCursor = new ArrayList<Character>();
	private List<Character> rightOfCursor = new ArrayList<Character>();
	
	
	/**To move the cursor one character to the left,
	 *  pop the left list and push the result onto the right list.
	 *  
	 *  to add a char to the screen it goes on the left side
	 */
	
	
	public List<Character> getLeftOfCursor() {
		return leftOfCursor;
	}
	public void setLeftOfCursor(List<Character> leftOfCursor) {
		this.leftOfCursor = leftOfCursor;
	}
	public List<Character> getRightOfCursor() {
		return rightOfCursor;
	}
	public void setRightOfCursor(List<Character> rightOfCursor) {
		this.rightOfCursor = rightOfCursor;
	}
	
	@Override
	public void update(char c) {
		getLeftOfCursor().add(c);
				
	}

	
	
}

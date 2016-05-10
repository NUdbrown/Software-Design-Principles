import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Characters;

public class TextBuffer {
	private List<Characters> leftOfCursor = new ArrayList<Characters>();
	private List<Characters> rightOfCursor = new ArrayList<Characters>();
	
	
	/**To move the cursor one character to the left,
	 *  pop the left list and push the result onto the right list.
	 */
	
	public List<Characters> getLeftOfCursor() {
		return leftOfCursor;
	}
	public void setLeftOfCursor(List<Characters> leftOfCursor) {
		this.leftOfCursor = leftOfCursor;
	}
	public List<Characters> getRightOfCursor() {
		return rightOfCursor;
	}
	public void setRightOfCursor(List<Characters> rightOfCursor) {
		this.rightOfCursor = rightOfCursor;
	}

	
	
}

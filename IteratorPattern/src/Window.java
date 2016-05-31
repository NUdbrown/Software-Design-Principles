import edu.neumont.csc415.Desktop;
import edu.neumont.csc415.DesktopColor;
import edu.neumont.csc415.DesktopGraphics;
import edu.neumont.csc415.IPaintable;
import edu.neumont.csc415.Point;

public class Window implements IPaintable, IModelObserver{
 //Have the window draw the window as a simple colored rectangle. [check] 
//Register a controller class with the window to receive keystrokes and place 
	//the corresponding characters in the window.

	//private List<Character> theChars = new ArrayList<Character>();
	//private DesktopGraphics dgraphics;
	private Desktop desktop;
	private Model model;
	private final int WIDTH = 600;
	private final int HEIGHT = 100;
	private char[][] characters = new char [HEIGHT][WIDTH];
	
	
	public Window(Desktop desktop, Model model) {	
		this.desktop = desktop;
		this.model = model;
	}

	@Override
	public void paint(DesktopGraphics arg0) {
		//this.dgraphics = arg0;
		Point topLeft = new Point(HEIGHT,300);
		Point bottomRight = new Point(WIDTH, 0);
		arg0.fillRectangle(topLeft,bottomRight , DesktopColor.LIGHT_GRAY);	
		//char width & height
		int index = 0;
		if( model.getIterator().sizeOfStacks() != 0){
			for(int row = 0; row < HEIGHT && index < model.getIterator().sizeOfStacks(); row++){
				for(int col = 0; col < WIDTH && index < model.getIterator().sizeOfStacks(); col++){					
					char c = characters[row][col];
					Point charPosition = new Point(col*desktop.getCharWidth(c) + topLeft.getX(), (row + 1)*desktop.getCharHeight()+topLeft.getY());
					//System.out.println("This should be on the screen: " + c + "\tposition: " + charPosition.toString());
					arg0.drawChar(c, charPosition, DesktopColor.MAGENTA);
					index++;
				}
			}			
		}						
		
	}

	//fill in the chars in the 2D
	private void fillChar2D(){

		int row = 0;
		int col = 0;
		Model.ModelIterator iterator  = model.getIterator();
		while(iterator.hasNext() && row < HEIGHT){
			char c  = (char) iterator.next();
			characters[row][col] = c;
//			System.out.println("the character is " + c);
			col++;
			if(col >= WIDTH || characters[row][col] == '\n'){
				row++;
				col = 0;
			}		
			
		}
	}

	//take in char , send to list
	@Override
	public void update() {	
		fillChar2D();	
		desktop.repaint();		
	}



	
	
}

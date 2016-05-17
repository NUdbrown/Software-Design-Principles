import java.util.ArrayList;
import java.util.List;

import edu.neumont.csc415.Desktop;

public class View{
	
	private List<Model> listOfModels = new ArrayList<Model>();


	
	public void registerObserver(Model model){
		listOfModels.add(model);
	}
	
	public void notifyObserver(char c){
		for(Model model : listOfModels){		
			model.update(c);
		}
	}
	
	public void showView(){
		Desktop desktop = new Desktop(800,800);
		Window window = new Window(desktop);
		desktop.registerPaintable(window);
		Keyboard keyboard = new Keyboard(desktop);
		keyboard.registerObserver(controller);
		keyboard.pollKeyboard();
	}

	
}

public class Controller {
	
	public static void main(String [] args){
		View view = new View();
		Model model = new Model();
		view.registerObserver(model);
		view.showView();
		//need switch to determine the keys and what to do with them.	
		
	}

	//cases: if char , backspace, left or right cursor
	public void sendChar(char c) {
		
		switch(c){
		 
		}
		
		
	}

}

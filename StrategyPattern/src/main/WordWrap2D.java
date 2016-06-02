package main;

public class WordWrap2D implements IFill2DArray {

	public WordWrap2D() {
		
	}

	@Override
	public void fill2D(Model model, char[][] arrayA, int height, int width) {
		int index = 0;
		for(int row = 0; row < height && index < model.getAllTheCharacters().size()  ; row++){
			for(int col = 0; col < (width - 100) && index < model.getAllTheCharacters().size(); col++){
					arrayA[row][col] = model.getAllTheCharacters().get(index);								
				index++;
			}
		}
		
	}

}

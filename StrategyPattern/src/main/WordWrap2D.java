package main;

public class WordWrap2D implements IFill2DArray {

	public WordWrap2D() {
		
	}

	@Override
	public void fill2D(Model model, char[][] arrayA, int height, int width) {
		System.out.println("Tihs is wordwrap");
		int index = 0;
		final int space = 20;
		for(int row = 0; row < height && index < model.getAllTheCharacters().size()  ; row++){
			for(int col = 0; col < width && index < model.getAllTheCharacters().size(); col++){
				if(model.getAllTheCharacters().get(index) == (char)space){
					row = row + 1;
					col = 0;
					arrayA[row][col] = model.getAllTheCharacters().get(index);													
				}else{
					arrayA[row][col] = model.getAllTheCharacters().get(index);												
				}
				index++;
			}
		}
		
	}

}

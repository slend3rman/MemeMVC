package application.meme;

public class MVCMeme {
	
    public static void main(String[] args) {
    	
    	MemeView theView = new MemeView();
        
    	MemeModel theModel = new MemeModel();
        
        MemeController theController = new MemeController(theView,theModel);
        
        theView.setVisible(true);
        
    }

}

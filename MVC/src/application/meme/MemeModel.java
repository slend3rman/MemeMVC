package application.meme;

public class MemeModel {
	private String caption = "When you ";
	
	public void addCapt(String userCapt){
		
		caption += userCapt;
		
	}
	
	public String getCaption(){
		
		return caption;
		
	}
}

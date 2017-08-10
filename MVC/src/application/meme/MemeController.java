package application.meme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemeController {
	private MemeView theView;
	private MemeModel theModel;
	
	public MemeController(MemeView theView, MemeModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.init();
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String caption = theView.getCaption();
				theModel.addCapt(caption);
				theView.changeText(theModel.getCaption());
			
		}
		
	}
	
}

package application.meme;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemeView extends JFrame{

	static JFrame f=new JFrame();//creating instance of JFrame  
    
	JButton b=new JButton("Generate Meme");//creating instance of JButton
	
	JTextField t1;
	JLabel l1,l2;
	
   
	
	public void init(){
	b.setBounds(50,650,200, 40);//x axis, y axis, width, height
	
	//Init text field
	t1=new JTextField("Enter Text");
	t1.setBounds(50,100,500,30);  
	
	//Init source Image
	l1=new JLabel(new ImageIcon("images\\woohoo.jpg"));  
    l1.setBounds(50,190, 800,450);
	
    //Init Caption
    l2=new JLabel("caption");
	l2.setBackground(Color.WHITE);
    l2.setBounds(50,130, 800,60);
    l2.setFont(new Font("Serif", Font.PLAIN, 25));
    l2.setOpaque(true);
	
    //adding items
	f.add(t1);
    f.add(l1);
	f.add(l2);
	f.add(b);  
	
	//Frame layout
	f.setSize(1000,800);//400 width and 500 height  
	f.setLayout(null);//using no layout managers  
	f.setVisible(true);//making the frame visible
	}
	
	public void changeText(String caption){
		l2.setText(caption);
	}
	
	public String getCaption(){
		
		return t1.getText();
	}
		void addCalculateListener(ActionListener listenForCalcButton){
			
			b.addActionListener(listenForCalcButton);		//on Button Click
			
		}
}	


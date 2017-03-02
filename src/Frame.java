import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.*;


public class Frame {
	
	public static void initMenu(int x, int y, int height, int width){
		
		//Creating Window
		JFrame frame = new JFrame("PowerBall");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(x, y, height, width);
		
		JButton playButton = new JButton("Play");
		playButton.setBounds(40, 40, 100, 20);
		
		JButton exitButton = new JButton("Exit");	
		exitButton.setBounds(40, 40, 100, 20);
		
		
		frame.add(playButton);
		frame.add(exitButton);
		
		
		
		
		



		frame.setVisible(true);
		
	} 	

}

package gui_tryouts;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class buttonclick implements ActionListener
{
	JFrame frame;
	JButton button;
	JLabel label;
	JPanel panel;
	int count=0;
	public buttonclick() 
	{
		frame = new JFrame();
		
		button = new JButton("Click me");
		button.setBackground(Color.YELLOW);
		button.setOpaque(true);
		button.setBorderPainted(false);
		button.addActionListener(this);
		
		label = new JLabel("No. of clicks : 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
		panel.setBackground(Color.pink);
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel,BorderLayout.WEST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("click the button(time waster)");
		frame.pack();
		frame.setVisible(true);
		
		//for cross fading button boundaries
		try {
			   UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			 }
		catch(Exception e){
			  e.printStackTrace(); 
			 }
	}
	
	public static void main(String[] args) {
		new buttonclick();
	}

	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("No. of clicks : "+count);
	}
}
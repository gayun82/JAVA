package co.micol.prj0509;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(); 
		JLabel label = new JLabel("some text");
		JButton btnl = new JButton("click me!");
		//JTextField//한줄
		JTextArea txtArea = new JTextArea(); //한줄 이상 여러줄
		JTextField txtField = new JTextField(200);
		JPanel btnPanel = new JPanel();
		
		
		panel.setLayout(new BorderLayout());
				
		panel.add(label,BorderLayout.NORTH);
		panel.add(btnl, BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		
		frame.add(panel);
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840,840/12*9));
		frame.setSize(840,840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
}
package learningJava;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


/*Write a program that displays a 3 by 3 grid of black and white rectangles. The rectangles should be 
 * positioned so that no two rectangles of the same color are adjacent to each other. 
 * */
 
public class Gui {
	
	public static void main(String[] args) {
		
		JFrame grid = new JFrame();
		grid.setTitle("My First GUI");
		grid.setSize(300, 200);
		grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.white);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.black);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.pink);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.gray);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.cyan);
		
		Container pane= grid.getContentPane();
		
		pane.setLayout(new GridLayout(3,3));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panel4);
		pane.add(panel5);
		
		
		grid.setVisible(true);
		
	}

}

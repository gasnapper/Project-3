import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Window {
	private JFrame frame;
	private int height;
	private int width;
	private JLabel numberLabel;
	private String number;
	
	public Window(){
		height = 500;
		width = 500;
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setVisible(true);
		
		number = JOptionPane.showInputDialog(frame, "Enter a number from 1,000 to 1,000,000, no commas,,:");
		
		
	}
}

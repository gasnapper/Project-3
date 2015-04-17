import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Window {
	private JFrame frame;
	private int height;
	private int width;
	private JLabel numberLabel;
	private String input;
	private Integer number;
	
	public Window(){
		height = 500;
		width = 500;
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		input = JOptionPane.showInputDialog(frame, "Enter a number from 1,000 to 1,000,000, no commas,:");
		
		
		
		number = Integer.parseInt(input);
		//getNumber();
		
	}
	
	public int getNumber(){
		return number;
	}
	
	
}

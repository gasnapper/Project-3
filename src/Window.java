import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Window {
	private JFrame frame;
	private int height;
	private int width;
	private JLabel numberLabel;
	private String input;
	
	public Window(){
		height = 500;
		width = 500;
		//numberLabel.setText("hello");
		
		frame = new JFrame();
		frame.setSize(width, height);
		//frame.add(numberLabel);
		input = JOptionPane.showInputDialog("Input Number x where \n"
				+ "1000<x<10,000,000. No Commas");
		frame.setVisible(true);
		
	}
}

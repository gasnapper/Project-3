import javax.swing.JFrame;
import javax.swing.JLabel;


public class Window {
	private JFrame frame;
	private int height;
	private int width;
	private JLabel numberLabel;
	
	public Window(){
		height = 500;
		width = 500;
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setVisible(true);
		
	}
}

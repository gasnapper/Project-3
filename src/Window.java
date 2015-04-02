import javax.swing.JFrame;


public class Window {
	private JFrame frame;
	private int height;
	private int width;
	
	public Window(){
		height = 500;
		width = 500;
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setVisible(true);
		
	}
}

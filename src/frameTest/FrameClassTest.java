package frameTest;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameClassTest extends WindowAdapter{

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		Frame f = new Frame("Login");
		f.setSize(300, 200);

		f.addWindowListener(this);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		FrameClassTest f = new FrameClassTest();
		f.startFrame();
		
	}

}

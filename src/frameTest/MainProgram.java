package frameTest;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainProgram extends WindowAdapter{
	Frame f;
	TextField msg;
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startMP() {
		f = new Frame("Main Program");
		f.addWindowListener(this);
		f.setSize(300, 200);
		f.setLayout(new FlowLayout());
		
		msg = new TextField("메인 프로그램을 시작합니다.", 30);
		msg.setEditable(false);
		
		f.add(msg);
		f.setVisible(true);
	}
}

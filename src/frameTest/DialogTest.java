package frameTest;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter implements ActionListener {

	Frame f;
	Dialog info;
	Label msg;
	Button ok;

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("OK")) {
			info.dispose();
		}
	}

	public void windowClosing(WindowEvent e) {
		if (e.getSource().getClass().toString().equals("class java.awt.Dialog")) {
			info.dispose();
		}
		if (e.getSource().getClass().toString().equals("class java.awt.Frame")){
			System.exit(0);
		}
		

	}

	public void startDialogTest() {
		f = new Frame("Parent");
		f.setSize(300, 200);

		f.addWindowListener(this);

		info = new Dialog(f, "Infomation", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());

		info.addWindowListener(this);

		msg = new Label("This is modal Dialog", Label.CENTER);
		ok = new Button("OK");
		ok.addActionListener(this);
		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);
	}

	public static void main(String[] args) {

		DialogTest dt = new DialogTest();
		dt.startDialogTest();

	}

}

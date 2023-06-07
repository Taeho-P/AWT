package frameTest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest extends WindowAdapter implements ActionListener {
	
	Frame f;
	Label lid;
	Label lpwd;	
	Button enter;
	TextField id, pwd, msg;
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		
		f = new Frame("Login");
		f.addWindowListener(this);
		f.setSize(430, 120);
		f.setLayout(new FlowLayout());
		
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Password : ", Label.RIGHT);
		
		enter = new Button("확인");
		enter.addActionListener(this);
		id = new TextField(10);
		pwd = new TextField(10);
		msg = new TextField(30);
		msg.setEditable(false);
		f.dispose();
		pwd.setEchoChar('*');
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(enter);
		f.add(msg);
		f.show();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(id.getText().equals("park") && pwd.getText().equals("123")) {
			msg.setText("로그인 되었습니다.");
			MainProgram mp = new MainProgram();
			mp.startMP();
			f.setVisible(false);
		} else {
			msg.setText("다시 시도해주세요.");
		}
		
	}
	
	public static void main(String[] args) {
		TextFieldTest t1= new TextFieldTest();
		t1.startFrame();
		
	}
	
}

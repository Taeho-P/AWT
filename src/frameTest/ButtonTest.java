package frameTest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest implements ActionListener{
	
	Frame f;
	Button b;
	
	public ButtonTest() {
		f = new Frame("Login");
		b = new Button("확인");
	}
	
	public void startFrame() {
		f.setSize(300, 200);
		f.setLayout(null);
		
		b.setSize(100,50);
		b.setLocation(700,75);
		b.addActionListener(this);
		
		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("확인버튼이 클릭됐습니다.");
		
	}
	
	public static void main(String[] args) {
		ButtonTest = new ButtonTest();
	}
}

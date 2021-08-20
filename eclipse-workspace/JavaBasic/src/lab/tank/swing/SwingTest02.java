package lab.tank.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//외부 클래스
public class SwingTest02{
	
	JTextArea textArea;
	JTextField textField;
	JButton writeButton;
	JButton cancleButton;
	
	public static void main(String[] args) {
		SwingTest02 st = new SwingTest02();
		st.go();
	}
	
	public void go() {
		//GUI 구현
		JFrame frame = new JFrame("Swing Test");
		
		JPanel mainPanel = new JPanel();
		
		textArea = new JTextArea(15, 30);
		textArea.setLineWrap(true); // 입력값이 긴 경우 행넘기기 출력할지 여부
		textArea.setEditable(false); // 편집 가능 여부
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		//구성요소 만들기
		textField = new JTextField(15);
		writeButton = new JButton("write");
		cancleButton = new JButton("cancle");
		
		//일반 내부 클래스 리스너 등록
		writeButton.addActionListener(new WriteButtonListener());
		
		//익명 내부 클래스 리스너 등록
		cancleButton.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.requestFocus();				
			}
		});
		
		mainPanel.add(scrollPane);
		mainPanel.add(textField);
		mainPanel.add(writeButton);
		mainPanel.add(cancleButton);
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(400, 350);
		frame.setVisible(true);
		
	}

	//내부 클래스
	public class WriteButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.append(textField.getText()+"\n");
			textField.setText("");
			textField.requestFocus();
		}
	}

//	public class CancleButtonListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			textField.setText("");
//			textField.requestFocus();
//		}
//	}
}

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

//�ܺ� Ŭ����
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
		//GUI ����
		JFrame frame = new JFrame("Swing Test");
		
		JPanel mainPanel = new JPanel();
		
		textArea = new JTextArea(15, 30);
		textArea.setLineWrap(true); // �Է°��� �� ��� ��ѱ�� ������� ����
		textArea.setEditable(false); // ���� ���� ����
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		//������� �����
		textField = new JTextField(15);
		writeButton = new JButton("write");
		cancleButton = new JButton("cancle");
		
		//�Ϲ� ���� Ŭ���� ������ ���
		writeButton.addActionListener(new WriteButtonListener());
		
		//�͸� ���� Ŭ���� ������ ���
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

	//���� Ŭ����
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

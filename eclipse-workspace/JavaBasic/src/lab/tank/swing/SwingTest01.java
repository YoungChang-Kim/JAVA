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

public class SwingTest01{
	
	JTextArea textArea;
	JTextField textField;
	JButton writeButton;
	JButton cancleButton;
	
	public static void main(String[] args) {
		SwingTest01 st = new SwingTest01();
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
		
		//������ ���
		writeButton.addActionListener(new WriteButtonListener(textArea, textField));
		cancleButton.addActionListener(new CancleButtonListener(textField));
		
		mainPanel.add(scrollPane);
		mainPanel.add(textField);
		mainPanel.add(writeButton);
		mainPanel.add(cancleButton);
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(400, 350);
		frame.setVisible(true);
		
	}

}

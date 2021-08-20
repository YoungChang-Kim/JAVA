package lab.tank.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CancleButtonListener implements ActionListener{
	JTextField textField;
	
	public CancleButtonListener(JTextField textField) {
		this.textField = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText("");
		textField.requestFocus();
	}
}

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("k19 - login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		JLabel label1 = new JLabel("Usuário: ");
		
		JTextField textField = new JTextField(20);
		
		JLabel label2 = new JLabel("Senha: ");
		
		JPasswordField passwordField = new JPasswordField(20);
		
		JButton button = new JButton("Logar: ");
		
		
		panel.add(label1);
		panel.add(textField);
		panel.add(label2);
		//panel.add(button);
		panel.add(passwordField);
		panel.add(button, 2);
		
		frame.setContentPane(panel);
		
		frame.pack();
		
		frame.setVisible(true);	
		
		
		
	}

}

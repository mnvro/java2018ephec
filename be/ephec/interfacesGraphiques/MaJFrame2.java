package be.ephec.interfacesGraphiques;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author mnv
 *
 */
public class MaJFrame2 extends JFrame {
	private JLabel monJLabel;
	private JTextField monJTextFiedl;

	public void init(){
		this.setVisible(true);
		this.setBounds(100,200,400,100);
		this.setTitle("Ma première fenêtre");
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.monJLabel = new JLabel("Nom : ");
		this.monJTextFiedl = new JTextField(20);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(monJLabel);
		this.getContentPane().add(monJTextFiedl);
		this.pack();

	}
	public MaJFrame2(){
		init();
	}

	public static void main(String[] args) {
		MaJFrame2 maJFrame = new MaJFrame2();
	}
}

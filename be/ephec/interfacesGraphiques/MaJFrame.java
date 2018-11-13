package be.ephec.interfacesGraphiques;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author mnv
 *
 */
public class MaJFrame extends JFrame implements ActionListener  {
	private JLabel monJLabel; 
	private JTextField monJTextFiedl;
	private JButton monJButton;
	public void init(){
		this.setVisible(true);
		
		this.setTitle("Ma première fenêtre");
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.monJLabel = new JLabel("Nom : ");
		this.monJTextFiedl = new JTextField(20);
		this.monJButton = new JButton("OK");
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(monJLabel);
		this.getContentPane().add(monJTextFiedl);
		this.getContentPane().add(monJButton);
		monJButton.addActionListener(this);
		
		this.setBounds(100,200,800,600);
		
		//this.pack();
	}
	public MaJFrame(){
		init();
	}
	public static void main(String[] args) {
		MaJFrame mJFrame = new MaJFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("on a cliqué sur "+e.getActionCommand());
		
	}

}

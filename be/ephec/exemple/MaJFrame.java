package be.ephec.exemple;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MaJFrame extends JFrame implements MouseListener, ActionListener{
	private JLabel monJLabel;
	private JTextField monJTextFiedl;
	private JButton monJButtonOK;
	private JButton monJButtonCancel;
	

	public MaJFrame() {
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.monJLabel = new JLabel("Nom : ");
	    this.monJTextFiedl = new JTextField(20);
	    this.monJButtonOK = new JButton("OK");
	    this.monJButtonCancel = new JButton("Cancel");
	    monJButtonOK.addActionListener(this);
	    monJButtonCancel.addActionListener(this);
	    this.getContentPane().setLayout(new FlowLayout());
	    this.getContentPane().add(monJLabel);
	    this.getContentPane().add(monJTextFiedl);
	    this.getContentPane().add(monJButtonOK);
	    this.getContentPane().add(monJButtonCancel);
	    this.setBounds(10,50,300,250);
	    monJLabel.addMouseListener(this);
	    monJTextFiedl.addMouseListener(this);
	    //this.pack();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("on a cliqué sur "+e.getSource().getClass().getSimpleName());
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("on est entré dans "+e.getSource().getClass().getSimpleName());
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	public static void main(String[] args) {
		MaJFrame toto = new MaJFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "OK":
			System.out.println("on a cliqué sur ok");
			break;
		case "Cancel":
			monJTextFiedl.setText("");
			System.out.println("on a cliqué sur Cancel");
			break;
		}
	}
	
}

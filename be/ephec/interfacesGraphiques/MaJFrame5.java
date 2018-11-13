package be.ephec.interfacesGraphiques;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author mnv
 *
 */
public class MaJFrame5 extends JFrame implements MouseListener {
	private JLabel monJLabel;
	private JTextField monJTextFiedl;
	public void init(){
		this.setVisible(true);
		this.setBounds(100,200,800,600);
		this.setTitle("Ma première fenêtre");
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.monJLabel = new JLabel("Nom : ");
		this.monJTextFiedl = new JTextField(20);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(monJLabel);
		this.getContentPane().add(monJTextFiedl);
		this.addMouseListener(this);
		this.pack();
	}
	public MaJFrame5(){
		init();
	}

	public static void main(String[] args) {
		MaJFrame5 maJFrame = new MaJFrame5();
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("on a cliqué");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

}

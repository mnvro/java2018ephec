package be.ephec.exemple.MVC2;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DevineLeNombreVue extends JFrame  {
	private int nbADeviner;
	private int nbEssais;
	private JLabel jLabelTitre;
	private JLabel jLabelSoluton;
	private JTextField jTextField;
	private JButton jButton;

	public void init() {
		nbADeviner = (int)(Math.random()*100);
		nbEssais = 0;
		jLabelTitre = new JLabel("Devine un nombre entre 0 et 99");
		jLabelSoluton = new JLabel("                     ");
		jTextField = new JTextField(10);
		jButton = new JButton("OK");
		Container jPannel = this.getContentPane();
		jPannel.setLayout(new FlowLayout());
		jPannel.add(jLabelTitre);
		jPannel.add(jTextField);
		jPannel.add(jLabelSoluton);
		jPannel.add(jButton);
//		jButton.addActionListener(this);
		this.setTitle("Devine le nombre");
		this.setVisible(true);
		Toolkit tk = Toolkit.getDefaultToolkit() ;
		Dimension dimEcran = tk.getScreenSize() ;

		this.setBounds(dimEcran.width/2-dimEcran.width/8,dimEcran.height/2-dimEcran.height/8,dimEcran.width/4,90);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public int getProposition() {
		return Integer.parseInt(jTextField.getText());
	}
	
	public void addActionListener(ActionListener al) {
		jButton.addActionListener(al);
	}

	public DevineLeNombreVue() {
		init();
	}
	
	public void reinitialiseLaVue() {
		jTextField.setText("");
		jLabelSoluton.setText("");
	}

	public void afficheResultat(String s) {
		jLabelSoluton.setText(s);
	}
	
}

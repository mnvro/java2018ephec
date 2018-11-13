package be.ephec.mvc_v3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Balance extends JFrame implements ActionListener {
	private JTextField jTextFieldMasse;
	private JLabel jLabelMasse;
	private JButton jButtonEnvoyer;
	private JButton jButtonMasseAleatoire;
	private Person person;
	
	public Balance(Person person){
		this.person = person;
		this.init();
	}
	
	public void init(){
		this.setBounds(900,150,600,800);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		jTextFieldMasse = new JTextField(10);
		jLabelMasse = new JLabel("Masse en kg");
		jButtonEnvoyer = new JButton("Envoyer");
		jButtonMasseAleatoire = new JButton("Choisir une masse aléatoire");
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(jLabelMasse);
		this.getContentPane().add(jTextFieldMasse);
		this.getContentPane().add(jButtonEnvoyer);
		this.getContentPane().add(jButtonMasseAleatoire);
		jButtonEnvoyer.addActionListener(this);
		jButtonMasseAleatoire.addActionListener(this);
		this.setTitle("Balance");
		this.pack();
	}

	/**
	 * @return une masse comprise entre 50 et 100 kg
	 */
	public static double getMasse(){
		return (int)(Math.random()*50)+50;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		switch (ae.getActionCommand()){
		case "Envoyer":
			person.setMass(Double.parseDouble(jTextFieldMasse.getText()));
			break;
		case "Choisir une masse aléatoire":
			jTextFieldMasse.setText(Balance.getMasse()+"");
			break;
		}
		
	}

}

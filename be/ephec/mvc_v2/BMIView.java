package be.ephec.mvc_v2;

//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it. 

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class BMIView extends JFrame implements Observer {

	private JLabel jLabelHeight;
	private JTextField jTextFieldHeight; // le 10 pour la largeur du champ
	private JLabel jLabelWeight;
	private JTextField jTextFieldweight;
	private JButton jButtonCalculeIMC;
	private JTextField jTextFieldCalcSolution;
	
	public void init(){
		jLabelHeight = new JLabel("Taille en mètre");
		jTextFieldHeight = new JTextField(10); // le 10 pour la largeur du champ
		jLabelWeight = new JLabel("Masse en kg");
		jTextFieldweight = new JTextField(10);
		jButtonCalculeIMC = new JButton("Calculer l'IMC");
		jTextFieldCalcSolution = new JTextField(10);
	}
	
	public BMIView(){
		
		init();
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200,150,800, 200);
		
		calcPanel.add(jLabelHeight);
		calcPanel.add(jTextFieldHeight);
		calcPanel.add(jLabelWeight);
		calcPanel.add(jTextFieldweight);
		calcPanel.add(jButtonCalculeIMC);
		calcPanel.add(jTextFieldCalcSolution);
		
		this.setTitle("Calcul de l'IMC");
		this.add(calcPanel);
		this.pack();
	}
	
	public double getTheHeight() {
		return Double.parseDouble(jTextFieldHeight.getText());
	}

	public double getTheWeight() {
		return Double.parseDouble(jTextFieldweight.getText());
	}
	
	public void setCalcSolution(double solution){
		DecimalFormat df = new DecimalFormat ( ) ; 
		df.setMaximumFractionDigits ( 2 ) ; //arrondi à 2 chiffres apres la virgules 
		jTextFieldCalcSolution.setText(df.format(solution));
	}
	
	public void addCalculateListener(ActionListener al){	
		jButtonCalculeIMC.addActionListener(al);	
	}
	
	public void update(Observable o, Object arg) {
		Person person = (Person) o;
		jTextFieldweight.setText(person.getMass()+"");
		this.setCalcSolution(person.getBMI());
	}
	
}
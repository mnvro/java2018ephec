package be.ephec.mvc_v3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class BMIController implements ActionListener {

	private BMIView theView;
	private Person person; // c'est notre modèle
	private Balance balance;
	private AfficheEnPopup afficheEnPopup;

	public BMIController(BMIView theView, Person person, AfficheEnPopup afficheEnPopup) {
		this.theView = theView;
		this.person = person;
		this.balance = new Balance(person);
		this.theView.addCalculateListener(this);
		this.afficheEnPopup = afficheEnPopup;
		person.addObserver(theView);
		person.addObserver(afficheEnPopup);
	}

	public void actionPerformed(ActionEvent e) {
		double height, weight = 0;
		height = theView.getTheHeight();
		weight = theView.getTheWeight();
		person.setHeight(height);
		person.setMass(weight);
		theView.setCalcSolution(person.getBMI());
	}

}
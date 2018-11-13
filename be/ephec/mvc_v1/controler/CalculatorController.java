package be.ephec.mvc_v1.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import be.ephec.mvc_v1.model.Person;
import be.ephec.mvc_v1.vue.BMIView;

public class CalculatorController implements ActionListener {

	private BMIView theView;
	private Person person; // c'est notre modèle

	public CalculatorController(BMIView theView, Person person) {
		this.theView = theView;
		this.person = person;	
		this.theView.addCalculateListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		double height, weight = 0;
		height = theView.getTheHeight();
		weight = theView.getTheWeight();
		person = new Person(height, weight);
		theView.setCalcSolution(person.getBMI());
	}

}
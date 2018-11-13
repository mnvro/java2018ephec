package be.ephec.mvc_v2;

import java.util.Observable;

/**
 * @author Marie-Noël Vroman
 * Cette classe contient les données
 * Elle est observable
 *
 */
public class Person extends Observable  {

	private double height;
	private double mass;
	
	/**
	 * @return the person's BMI (Body Mass Index)
	 */
	public double getBMI(){
		return mass/(height*height);
	}
	
	public double getMass() {
		return mass;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setMass(double mass) {
		this.mass = mass;
		this.setChanged();
		this.notifyObservers();
	}

	public Person(){
	}

	/**
	 * @param height the person's height in m
	 * @param mass the person's mass in kg
	 */
	public Person(double height, double mass) {
		this.height = height;
		this.mass = mass;
	}
	
}
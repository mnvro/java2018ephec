package be.ephec.mvc_v1.model;


/**
 * @author Marie-Noël Vroman
 */
public class Person {
	
	private double height;
	private double mass;
	
	/**
	 * @return the person's BMI (Body Mass Index)
	 */
	public double getBMI(){
		return mass/(height*height);
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
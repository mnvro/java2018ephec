package be.ephec.mvc_v3;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

public class AfficheEnPopup implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Person p = (Person)o;
		System.out.println("Le mod�le a �t� modifi� !");
		System.out.println(p);
		JOptionPane.showMessageDialog(null, p, "Le mod�le a �t� modifi� !", JOptionPane.INFORMATION_MESSAGE);
	}

}

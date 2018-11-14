package be.ephec.exemple.MVC2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class DevineLeNombreControleur implements ActionListener {
	private DevineLeNombreVue vue;
	private DevineLeNombreModele modele;
	
	
	
	public DevineLeNombreControleur(DevineLeNombreVue vue, DevineLeNombreModele modele) {
		super();
		this.vue = vue;
		this.modele = modele;
		vue.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		modele.setProposition(vue.getProposition());
		if (modele.trouve()){
			JOptionPane.showMessageDialog(vue, "Vous avez deviné en "+modele.getNbEssais()+" essais", "Bravo", JOptionPane.INFORMATION_MESSAGE);
			modele = new DevineLeNombreModele();
			vue.reinitialiseLaVue();
		} else {
			modele.unEssaiDePlus();
			vue.afficheResultat(modele.getResultat());
		}
	}
	
	public static void main(String[] args) {
		DevineLeNombreModele modele = new DevineLeNombreModele();
		DevineLeNombreVue vue = new DevineLeNombreVue();
		DevineLeNombreControleur controleur = new DevineLeNombreControleur(vue, modele);
	}
}

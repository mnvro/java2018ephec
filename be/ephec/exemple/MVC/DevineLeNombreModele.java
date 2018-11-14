package be.ephec.exemple.MVC;

public class DevineLeNombreModele {
	private int nbADeviner;
	private int nbEssais;
	private int proposition;
	
	public String getResultat() {
		if (proposition < nbADeviner) return "Trop petit";
		if (proposition > nbADeviner) return "Trop grand";
		return "Bonne réponse";
	}

	public DevineLeNombreModele() {
		super();
		this.nbADeviner = (int)(Math.random()*100);
		this.nbEssais = 0;
	}
	
	
}

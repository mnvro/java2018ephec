package be.ephec.exemple.MVC2;

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

	public int getNbADeviner() {
		return nbADeviner;
	}

	public void setNbADeviner(int nbADeviner) {
		this.nbADeviner = nbADeviner;
	}

	public int getNbEssais() {
		return nbEssais;
	}

	public void setNbEssais(int nbEssais) {
		this.nbEssais = nbEssais;
	}

	public int getProposition() {
		return proposition;
	}

	public void setProposition(int proposition) {
		this.proposition = proposition;
	}
	
	public boolean trouve() {
		return (nbADeviner == proposition);
	}
	public void unEssaiDePlus() {
		nbEssais++;
	}
	
}

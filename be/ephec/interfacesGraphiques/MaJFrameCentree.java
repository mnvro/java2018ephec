package be.ephec.interfacesGraphiques;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author mnv
 *
 */
public class MaJFrameCentree extends JFrame {
	public void init() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit tk = Toolkit.getDefaultToolkit() ;
		Dimension dimEcran = tk.getScreenSize() ;
		int largeur = dimEcran.width ;
		int hauteur = dimEcran.height ;
		this.setBounds(largeur/4,hauteur/4,largeur/2,hauteur/2);
	}
	public MaJFrameCentree() {
		init();
	}
	public static void main(String[] args) {
		MaJFrameCentree maJFrameCentree = new MaJFrameCentree();
	}
}

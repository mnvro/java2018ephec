package be.ephec.interfacesGraphiques;

import javax.swing.JFrame;

/**
 * @author mnv
 *
 */
public class MaJFrame1 extends JFrame {

	  public void init(){
	    this.setVisible(true);
	    this.setBounds(100,200,400,100);
	    this.setTitle("Ma première fenêtre");
	    this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	  }
	  public MaJFrame1(){
	    init();
	  }

	  public static void main(String[] args) {
	    MaJFrame1 maJFrame = new MaJFrame1();
	  }
	}

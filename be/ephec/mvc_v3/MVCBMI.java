package be.ephec.mvc_v3;

public class MVCBMI {
    
    public static void main(String[] args) {
    	BMIView theView = new BMIView();
    	Person theModel = new Person();
    	AfficheEnPopup afficheEnPopup = new AfficheEnPopup();
        BMIController theController = new BMIController(theView,theModel,afficheEnPopup);     
        theView.setVisible(true); 
    }
}
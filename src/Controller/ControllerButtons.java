package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class ControllerButtons implements ActionListener {

	 AppMain appM;
	 
	 
	    public ControllerButtons(AppMain appM) {
	        this.appM = appM;
	        
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	    	//reset marche pas trop
	    	appM.getModelAppMain().resetValues();
	    	//sert que pour le bouton recommencer
	    	appM.changePanel();
	    	
	    	appM.updateThanks();
	    	
	    	
	    }
	    
}

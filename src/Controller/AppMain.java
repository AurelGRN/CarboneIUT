package Controller;
import javax.swing.*;

import Model.Model;

public class AppMain {
	
	public JFrame frame;
	
    UiHandler UIHandler;
    
    Model modelAppMain;

    //AppMain appM;

	public AppMain() {
		
        this.frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 100);
        frame.setLocationRelativeTo(null);  // Start the window in the middle of the screen
        frame.setVisible(true);
        
     // Cr�er une instance de mod�le unique pour toute l'application
        modelAppMain = new Model();
        
   
        UIHandler = new UiHandler(this);
        
        
    }

    

    public void changePanel() { 
    	
    	UIHandler.changePanel();
    	
    	System.out.println(modelAppMain.getMin() +"  test 1 "+ modelAppMain.getMax());
    	System.out.println(modelAppMain.getCo2MachineUtilisateur() +"  test 1 "+ modelAppMain.getMachineUtilisateur());
    }
    
    
    public void updateThanks() {
    	
    	UIHandler.updateThanks();
    	
    }
    
    public boolean validateInput(int input) {
        return input >= 0;
    }
    
   
    
    
    
    public Model getModelAppMain() {
		return modelAppMain;
	}
    
	public void setModelAppMain(Model modelAppMain) {
		this.modelAppMain = modelAppMain;
	}

	
	
	
	
	public static void main(String[] args) {
		
        new AppMain();
    }
    
}//a

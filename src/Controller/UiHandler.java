package Controller;
import javax.swing.*;

import View.PanelComing;
import View.PanelMeals;
import View.PanelThanks;
import View.PanelTypeOrdi;
import View.PanelWelcome;

import java.awt.*;

public class UiHandler {
    CardLayout card;
    Container container;
    AppMain appM;
    PanelThanks panThanks;
    PanelMeals panMeals;
    

    
    public UiHandler(AppMain appM) {
    	
        this.appM = appM;
       

        
        container = appM.frame.getContentPane(); 
        card = new CardLayout();
        container.setLayout(card);
       
        container.add(new PanelWelcome(appM));
        
        container.add(new PanelComing(appM));
        
        container.add (new PanelMeals(appM)); // Ajouter la vue des repas ici
        
        container.add(new PanelTypeOrdi(appM));
        
        panThanks = new PanelThanks(appM);
        
        container.add(panThanks);
    }

    public void changePanel() {
        card.next(container);
    }

    public void updateThanks() {
    	
    	panThanks.afficheCo2();
    }
    
    
}//a
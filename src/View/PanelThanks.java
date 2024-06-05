package View;
import Controller.*;
import javax.swing.*;

import Model.Data;
import Model.Model;

import java.awt.*;
import Controller.AppMain;
public class PanelThanks  extends JPanel{
	
	
    AppMain appM;
    Model model;
    
    JLabel labelTransport;
    JLabel labelRepas;
    JLabel labelOrdi;
    JLabel labelServeur;
    JLabel labelTotal;
    
    double co2;
    String ModeTransport;
    String Machine;
    double co2Machine;
    
    public PanelThanks(AppMain appM) {
    	
        super(new FlowLayout());
        
        this.appM = appM;
        
        this.labelTransport = new JLabel();
        this.labelRepas = new JLabel();
        this.labelOrdi = new JLabel();
        this.labelServeur = new JLabel();
        this.labelTotal = new JLabel();
        
        JButton b2 = new JButton("Recommencer");
        
        
        this.add(labelTransport);
        this.add(labelRepas);
        this.add(labelOrdi);
        this.add(labelServeur);
        this.add(labelTotal);
        
        this.add(b2);
        
        //reset
        b2.addActionListener(new ControllerButtons(appM));
        
     
    }

    public void afficheCo2() {
    	
    	
    	labelTransport.setText("     1/ Votre transport : "     +   appM.getModelAppMain().getMode()               + " emet entre " + appM.getModelAppMain().getMin() + " et " + appM.getModelAppMain().getMax()+ " kg de CO2 par semaine \n");
    	labelRepas.setText("         2/ Vos repas  emettent : " +   appM.getModelAppMain().getco2Repas() + " kg de C02 par semaine \n");
    	labelOrdi.setText("\n\n\n    3/ Votre machine: " + appM.getModelAppMain().getMachineUtilisateur() + " emet " + appM.getModelAppMain().getCo2MachineUtilisateur() + " kg de CO2 par semaine \n");
    	labelServeur.setText("\n\n\n 4/ le serveur emet : " + Data.serveurCarbone + " kg de CO2 par semaine \n" );
    	labelTotal.setText("\n\n\n   5/ Au Total entre : " + String.format("%.3f", appM.getModelAppMain().getMin() + appM.getModelAppMain().getco2Repas() + appM.getModelAppMain().getCo2MachineUtilisateur() + Data.serveurCarbone) + " et : "+ String.format("%.2f", appM.getModelAppMain().getMax() + appM.getModelAppMain().getco2Repas() + appM.getModelAppMain().getCo2MachineUtilisateur() + Data.serveurCarbone) +" kg de CO2 par semaine \n" );

    }
    

}//a

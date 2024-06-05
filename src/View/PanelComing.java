package View;
//a
import Controller.AppMain;
import javax.swing.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;

public class PanelComing extends JPanel{

	
	AppMain appM;
	
	 public PanelComing(AppMain appM) {
		 
	        super(new FlowLayout());
	        this.appM = appM;
	        
	        JLabel text = new JLabel("Transports pour venir a l'iut");
	        JButton b1 = new JButton("Voiture Perso");
	        JButton b2 = new JButton("Covoiturage");
	        JButton b3 = new JButton("Velo");
	        JButton b4 = new JButton("Transports en commun");
	        JButton b5 = new JButton("Autre");
	        this.add(text);
	        this.add(b1);
	        this.add(b2);
	        this.add(b3);
	        this.add(b4);
	        this.add(b5);
	        
	    /*    b1.addActionListener(new ControllerButtons(appM));
	        b2.addActionListener(new ControllerButtons(appM));
	        b3.addActionListener(new ControllerButtons(appM));
	        b4.addActionListener(new ControllerButtons(appM));
	        b5.addActionListener(new ControllerButtons(appM));*/
	        
	        
	        b1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
	            	appM.getModelAppMain().setMode("Voiture Perso");
	            	appM.getModelAppMain().updateMinMax(e.getActionCommand());
	            	appM.changePanel();
	            }
	            
	        });
	        
	        b2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
	            	appM.getModelAppMain().setMode("Covoiturage");
	            	appM.getModelAppMain().updateMinMax(e.getActionCommand());
	            	appM.changePanel();
	            }
	            
	        });
	        
	        b3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
	            	appM.getModelAppMain().setMode("Velo");
	            	appM.getModelAppMain().updateMinMax(e.getActionCommand());
	            	appM.changePanel();
	            }
	            
	        });
	        
	        b4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
	            	appM.getModelAppMain().setMode("Transports en commun");
	            	appM.getModelAppMain().updateMinMax(e.getActionCommand());
	            	appM.changePanel();
	            }
	            
	        });
	        
	        b5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               
	            	appM.getModelAppMain().setMode("Autre");
	            	appM.getModelAppMain().updateMinMax(e.getActionCommand());
	            	appM.changePanel();
	            }
	            
	        });
	        
	       
	    }
	 
	 
	 
	 
	 
	 
}

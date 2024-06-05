package View;
import javax.swing.*;

import Model.Model;

import java.awt.*;
import java.awt.event.*;
import Controller.AppMain;
public class PanelMeals extends JPanel {
	
	public JLabel label;
    public JTextField veganField;
    public JTextField vegetarienField;
    public JTextField boeufField;
    public JTextField viandePoissonField;
    public JButton backBtn;
    public JButton nextBtn;
    
    
    Model model;
    AppMain appM;
    
    public PanelMeals(AppMain appM) {
    	
        super(new GridLayout(5, 2, 10, 10));
        label = new JLabel("Quantites de repas par semaine : ");
        veganField = new JTextField();
        vegetarienField = new JTextField();
        boeufField = new JTextField();
        viandePoissonField = new JTextField();
        backBtn = new JButton("Quitter");
        nextBtn = new JButton("Suivant");
        this.appM = appM;
        add(new JLabel("Vegan"));
        add(veganField);
        add(new JLabel("Vegetarien"));
        add(vegetarienField);
        add(new JLabel("A base de Boeuf"));
        add(boeufField);
        add(new JLabel("A base d'une autre viande ou d'un poisson"));
        add(viandePoissonField);
        add(backBtn);
        add(nextBtn);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	
                    int vegan = Integer.parseInt(veganField.getText());
                    int vegetarien = Integer.parseInt(vegetarienField.getText());
                    int boeuf = Integer.parseInt(boeufField.getText());
                    int viandePoisson = Integer.parseInt(viandePoissonField.getText());

                    if (appM.validateInput(vegan) && appM.validateInput(vegetarien) && appM.validateInput(boeuf) && appM.validateInput(viandePoisson)) {
                    	
                    	//appel fonction pour calculer les valeurs dans les textFields 
                    	appM.getModelAppMain().updateMeals(vegan, vegetarien, boeuf, viandePoisson);
                       
                    	appM.changePanel();
                    	
                    } 
                    
                    else {
                    	
                        JOptionPane.showMessageDialog(null, "Les quantites de repas doivent etre des nombres positifs.");
                    }
                    
                } 
                
                catch (NumberFormatException ex) {
                	
                    JOptionPane.showMessageDialog(null, "Les quantites de repas doivent etre des nombres.");
                }
            }
            
        });//a
    }
}
package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
public class PanelTypeOrdi extends JPanel{
	
	public JRadioButton portable;
	public JRadioButton machine;
	public JButton backBtn;
    public JButton nextBtn;
    AppMain appM ;
    
	public PanelTypeOrdi(AppMain appM) {
		
		super(new FlowLayout());
		this.appM = appM;
		JLabel l = new JLabel("Quel appareil utilisez vous en cours ?");
		portable = new JRadioButton  ("Portable Perso");
		machine = new JRadioButton  ("Machine IUT");
		backBtn = new JButton("Quitter");
        nextBtn = new JButton("Suivant");
		this.add(l);
		
		
		this.add(portable);
		this.add(machine);
		
		this.add(backBtn);
		this.add(nextBtn);
		
		
		nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	

            	if (portable.isSelected()) {
            	    

            	    appM.getModelAppMain().setCo2MachineUtilisateur(2.5);
            	    appM.getModelAppMain().setMachineUtilisateur("Portable Perso");
            	    
            	    
            	} 
            	
            	else if (machine.isSelected()) {
            		

            	    appM.getModelAppMain().setCo2MachineUtilisateur(5.0);
            	    appM.getModelAppMain().setMachineUtilisateur("Machine IUT");
            	}

	
            	appM.updateThanks();
            	appM.changePanel();
            	appM.getModelAppMain().updateMinMax(e.getActionCommand());
            	
            }
        });
		
		//nextBtn.addActionListener(new ControllerButtons(appM));
		
		backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	

                System.exit(0);

            }
        });
		
	}
}
//a
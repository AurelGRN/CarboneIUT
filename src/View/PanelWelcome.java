package View;
import Controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelWelcome extends JPanel {

	AppMain appM;
	
	public PanelWelcome(AppMain appM)  {
        super(new FlowLayout());
        this.appM = appM;
        JLabel l = new JLabel("Bienvenue !");
        JButton b1 = new JButton("Commencer");
        this.add(l);
        this.add(b1);
        
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            	appM.changePanel();
            }
            
        });
    }
	
}
//a
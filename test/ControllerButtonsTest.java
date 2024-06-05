
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertThrows;

import java.awt.event.ActionEvent;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Controller.AppMain;
import Controller.ControllerButtons;
import Model.Model;

public class ControllerButtonsTest {

	
	private  Model model;
	private AppMain app;
	private ControllerButtons controller;
	
	
	@Before
	public void setUp() {
		model = new Model();
		app = new AppMain();
		controller = new ControllerButtons(app);
	}

	 @Test
	    public void testActionListenerVoiturePerso() {
	        ActionEvent event = new ActionEvent(new Object(), 0, "Voiture Perso");
	        controller.actionPerformed(event);
	        model.updateMinMax("Voiture Perso");
	        assertEquals(20.0, model.getMax(), 0.01);
	        assertEquals(4.5, model.getMin(), 0.01);
	    }

	    @Test
	    public void testActionListenerCovoiturage() {
	        ActionEvent event = new ActionEvent(new Object(), 0, "Covoiturage");
	        controller.actionPerformed(event);
	        model.updateMinMax("Covoiturage");
	        assertEquals(10.0, model.getMax(), 0.01);
	        assertEquals(2.0, model.getMin(), 0.01);
	    }

	    @Test
	    public void testActionListenerTransportsEnCommun() {
	        ActionEvent event = new ActionEvent(new Object(), 0, "Transports en commun");
	        controller.actionPerformed(event);
	        model.updateMinMax("Transports en commun");
	        assertEquals(1.0, model.getMax(), 0.01);
	        assertEquals(0.2, model.getMin(), 0.01);
	    }
	
	@Test
	public void testActionListenerVelo() {
		ActionEvent event = new ActionEvent(new Object(), 0, "Velo");
		controller.actionPerformed(event);
		model.updateMinMax("Velo");
		assertEquals(0.22, model.getMax(), 0.01);
		assertEquals(0.001, model.getMin(), 0.001);
	}
	
	@Test
	public void testActionListenerAutre() {
		ActionEvent event = new ActionEvent(new Object(), 0, "Autre");
		controller.actionPerformed(event);
		model.updateMinMax("Autre");
		assertEquals(20, model.getMax(), 0.01);
		assertEquals(0.0, model.getMin(), 0.01);
	}
	
}

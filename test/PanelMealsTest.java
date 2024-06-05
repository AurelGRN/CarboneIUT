import org.junit.Before;
import org.junit.Test;

import Controller.AppMain;
import View.PanelMeals;

import static org.junit.Assert.*;

public class PanelMealsTest {
    private AppMain app;
    private PanelMeals panel;

    @Before
    public void setUp() {
        app = new AppMain();
        panel = new PanelMeals(app);
    }

    @Test
    public void testTextFieldsAreInitialized() {
        assertNotNull(panel.veganField);
        assertNotNull(panel.vegetarienField);
        assertNotNull(panel.boeufField);
        assertNotNull(panel.viandePoissonField);
    }

    @Test
    public void testButtonsAreInitialized() {
        assertNotNull(panel.backBtn);
        assertNotNull(panel.nextBtn);
    }
}

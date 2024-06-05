import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import Controller.AppMain;
import View.PanelTypeOrdi;

public class PanelTypeOrdiTest {
    private AppMain app;
    private PanelTypeOrdi panel;

    @Before
    public void setUp() {
        app = new AppMain();
        panel = new PanelTypeOrdi(app);
    }
    @Test
    public void testRadioButtonsInitialState() {
        assertFalse(panel.portable.isSelected());
        assertFalse(panel.machine.isSelected());
    }
    @Test
    public void testNextButtonInitialState() {
        assertNotNull(panel.nextBtn);
        assertEquals("Suivant", panel.nextBtn.getText());
    }
}
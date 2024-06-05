import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Model;
import Model.WeekMeals;



public class WeekMealsTest {
    
    private static WeekMeals weekMeals;
    private static Model model;
    
    @BeforeClass
	public static void setUpBeforeClass() throws Exception {
    	
		weekMeals = new WeekMeals();
		model = new Model();
	}

	@Before
	public void setUp() throws Exception {
		weekMeals.init();
	}
 
    @Test
    public void testAjoutPlatExisteQuantitePositive() {
        weekMeals.addMeal(WeekMeals.Meal.VEGAN, 2);
        assertEquals(2, weekMeals.getNbVegan(), 0.0);
    }
    
    @Test
    public void testAjoutPlatExisteQuantiteNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            weekMeals.addMeal(WeekMeals.Meal.VEGAN, -2);
        });
    }
    
    
   

}
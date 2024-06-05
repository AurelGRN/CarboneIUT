package Model;
public class WeekMeals {
//e	
    private int nbVegan;
	private int nbVegetarien;
	private int nbBoeuf;
	private int nbViandePoisson;

	public enum Meal {
		VEGAN, VEGETARIEN, BOEUF, AUTRE;
	}
	
	public WeekMeals() {
		init();
	}
	
	public void init() {
		this.nbVegan = 0;
		this.nbVegetarien = 0;
		this.nbBoeuf = 0;
		this.nbViandePoisson = 0;
	}
	
	public void addMeal(Meal m, int q) {	
	    if (q < 0) {
	        throw new IllegalArgumentException("La quantit� ne peut pas etre negative");
	    }
	    switch(m) {
	        case VEGAN:
	            this.nbVegan += q;
	            break;
	        case VEGETARIEN:
	            this.nbVegetarien += q;
	            break;
	        case BOEUF:
	            this.nbBoeuf += q;
	            break;
	        case AUTRE:
	            this.nbViandePoisson += q;
	            break;
	        default:
	            throw new IllegalArgumentException("Type de repas non reconnu");
	    }
	}


	// Getters et setters

	public int getNbVegan() {
		return nbVegan;
	}

	public void setNbVegan(int nbVegan) {
		this.nbVegan = nbVegan;
	}

	public int getNbVegetarien() {
		return nbVegetarien;
	}

	public void setNbVegetarien(int nbVegetarien) {
		this.nbVegetarien = nbVegetarien;
	}

	public int getNbBoeuf() {
		return nbBoeuf;
	}

	public void setNbBoeuf(int nbBoeuf) {
		this.nbBoeuf = nbBoeuf;
	}

	public int getNbViandePoisson() {
		return nbViandePoisson;
	}

	public void setNbViandePoisson(int nbViandePoisson) {
		this.nbViandePoisson = nbViandePoisson;
	}

	// M�thode de calcul d'�missions CO2

	double computeCO2() {
	    double totalCO2 = 0.0;

	    totalCO2 += nbVegan * getCO2(Meal.VEGAN);
	    totalCO2 += nbVegetarien * getCO2(Meal.VEGETARIEN);
	    totalCO2 += nbBoeuf * getCO2(Meal.BOEUF);
	    totalCO2 += nbViandePoisson * getCO2(Meal.AUTRE);

	    return totalCO2;
	}

	public static double getCO2(Meal meal) {
	    switch (meal) {
	        case VEGAN:
	            return 0.4;
	        case VEGETARIEN:
	            return 0.5;
	        case BOEUF:
	            return 7.0;
	        case AUTRE:
	            return 1.1;
	        default:
	            return 0.0;
	    }
	}
	
	public static void main(String[] args) {
		
		/*// Exemple d'utilisation
		WeekMeals meals = new WeekMeals();
		meals.addMeal(Meal.VEGAN, 2);
		meals.addMeal(Meal.VEGETARIEN, 3);
		meals.addMeal(Meal.BOEUF, 1);
		meals.addMeal(Meal.AUTRE, 4);
		System.out.println("Emissions de CO2 : " + meals.computeCO2() + " kg");*/
		
	}
}
package Model;
import Controller.AppMain;

//a

public class Model {

	
	 AppMain appM;
	 
	 private double min;
	 private double max;
	 
	 private double co2MachineUtilisateur;
     private String machineUtilisateur;
     
    private  String modeTransport;
	private  double co2Repas;
	
	 
	 
	 
	 
	 public Model() {
		 
		 this.min = 0.0;
	     this.max = 0.0;
	     
		 this.co2MachineUtilisateur = 0.0;
		 this.machineUtilisateur = "";
		 
		 this.modeTransport ="";
		 this.co2Repas =0.0;
		 
	
	 }
	  



	  public void updateMinMax(String modeTransport) {
		  
	        switch(modeTransport) {
	        
	            case "Voiture Perso":
	                this.min = Data.minVoiture;
	                this.max = Data.maxVoiture;
	                break;
	            case "Covoiturage":
	                this.min = Data.minCovoiturage;
	                this.max = Data.maxCovoiturage;
	                break;
	            case "Velo":
	                this.min = Data.minVelo;
	                this.max = Data.maxVelo;
	                break;
	            case "Transports en commun":
	                this.min = Data.minCommun;
	                this.max = Data.maxCommun;
	                break;
	            case "Autre":
	                this.min = Data.minAutre;
	                this.max = Data.maxAutre;
	                break;
	            default:
	                this.min = 0.0;
	                this.max = 0.0;
	                break;
	        }
	    }
	    
	   
	  public void resetValues() {
		    this.min = 0.0;
		    this.max = 0.0;
		    this.co2MachineUtilisateur = 0.0;
		    this.machineUtilisateur = "";
		    this.modeTransport ="";
		    this.co2Repas = 0.0;
		}


		public void updateMeals(int vegan, int vegetarien, int boeuf, int viandePoisson) {
	    	
	    	//on cree un WeeksMeals
	    	
	        WeekMeals meals = new WeekMeals();
	        
	        meals.addMeal(WeekMeals.Meal.VEGAN, vegan);
	        meals.addMeal(WeekMeals.Meal.VEGETARIEN, vegetarien);
	        meals.addMeal(WeekMeals.Meal.BOEUF, boeuf);
	        meals.addMeal(WeekMeals.Meal.AUTRE, viandePoisson);

	        co2Repas = meals.computeCO2();
	         

	        
	        System.out.println("Total des �missions de CO2 : " + co2Repas);
	    }
	    
	    public double getco2Repas() {
			return co2Repas;
		}

		public void setco2Repas(double co2) {
			this.co2Repas = co2;
		}
		
		public String getMode() {
			return modeTransport;
		}
		
		public void setMode(String modeTransport) {
		    this.modeTransport = modeTransport;
		    
		}
		
		public double getMin() {
	        return this.min;
	    }
	    
	    public double getMax() {
	        return this.max;
	    }
	    
	    
	    public double getCo2MachineUtilisateur() {
	        return co2MachineUtilisateur;
	    }
	    
	   
	    public String getMachineUtilisateur() {
	        return machineUtilisateur;
	    }
	    
	
	    public void setCo2MachineUtilisateur(double co2MachineUtilisateur) {
	        this.co2MachineUtilisateur = co2MachineUtilisateur;
	    }
	    
	   
	    public void setMachineUtilisateur(String machineUtilisateur) {
	        this.machineUtilisateur = machineUtilisateur;
	    }
	    
	    
}


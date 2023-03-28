//Create a method to get the attributes of the meal class
public class Meal {
	private String mealDescription;
	private double mealCost;
	private int qty;

	// Create a constructor
    // This method is used to initialize the attributes to
    // the values that we specify for each object
	public Meal(String mealDescription, double mealCost) {
		this.mealDescription = mealDescription;
		this.mealCost = mealCost;
	}

	
    // Implementing the applicable getters for this class
	public String getMealDescription() {
		return mealDescription;
	}

	public double getMealCost() {
		return mealCost;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getQty() {
		return qty;
	}

}

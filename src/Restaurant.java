import java.util.ArrayList;
//Create a restaurant class with the following attributes
public class Restaurant {

	private String restaurantName;
	private String restaurantLocation;
	private String restaurantContactDetails;
	//Add an array list or meals
	private ArrayList<Meal> meals = new ArrayList<Meal>();

	  // Create a constructor
    // This method is used to initialize the attributes to
    // the values that we specify for each object
	public Restaurant(String restaurantName, String restaurantLocation, String restaurantContactDetails) {
		this.restaurantName = restaurantName;
		this.restaurantLocation = restaurantLocation;
		this.restaurantContactDetails = restaurantContactDetails;
	}

	
    // Implementing the applicable getters for this class
	public String getRestaurantName() {
		return restaurantName;
	}

	public String getRestaurantLocation() {
		return restaurantLocation;
	}

	public String getRestaurantContactDetails() {
		return restaurantContactDetails;
	}

	public void addmeals(String mealDescription, double mealPrice) {
		Meal newMenuItem = new Meal(mealDescription, mealPrice);
		this.meals.add(newMenuItem);
	}

	public ArrayList<Meal> getMeals() {
		return meals;
	}

}

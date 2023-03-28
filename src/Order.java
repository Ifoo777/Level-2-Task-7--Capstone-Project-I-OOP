import java.util.ArrayList;
//Create a order class with the following attributes
public class Order {

	private Customer customerDetails;
	private Restaurant customerRestuarant;
	private double totalOfOrder;
	private String driver;
	private int orderNumber;
	private ArrayList<String> specialInstructions = new ArrayList<String>();

	// Create a constructor
    // This method is used to initialize the attributes to
    // the values that we specify for each object
	public Order(Customer customerDetails, Restaurant customerRestuarant) {
		this.customerDetails = customerDetails;
		this.customerRestuarant = customerRestuarant;
		this.orderNumber = (int) (Math.random() * 10000);

	}

	
    // Implementing the applicable getters for this class
	public Customer getCustomerDetails() {
		return customerDetails;
	}

	public Restaurant getCustomerRestuarant() {
		return customerRestuarant;
	}

	//Create a method to set the menu item quantity
	public void setMenuItemQty(String menuItem, int qty) {

		//Iterate through the meals array
		for (int i = 0; i < customerRestuarant.getMeals().size(); i++) {
	
			if (customerRestuarant.getMeals().get(i).getMealDescription() == menuItem) {

				customerRestuarant.getMeals().get(i).setQty(qty);
			}
		}
	}


	//Create a method to set the total order
	public void setTotalOfOrder() {

		for (int i = 0; i < customerRestuarant.getMeals().size(); i++) {

			this.totalOfOrder += customerRestuarant.getMeals().get(i).getMealCost()
					* customerRestuarant.getMeals().get(i).getQty();
		}
	}

	//Create a method to add special instructions 
	public void addSpecialInstructions(String instruction) {
		this.specialInstructions.add(instruction);
	}

	//Create a method to generate the special instructons and add to string
	public String generateSpecialInstructions() {
		String instructions = "";
		for (int i = 0; i < this.specialInstructions.size(); i++) {
			instructions += specialInstructions.get(i) + "\n";
		}
		return instructions;
	}

	public String generateMealsOrdered() {
		String info = "";

		for (int i = 0; i < customerRestuarant.getMeals().size(); i++) {

			if (customerRestuarant.getMeals().get(i).getQty() > 0) {
				info += customerRestuarant.getMeals().get(i).getQty() + " X "
						+ customerRestuarant.getMeals().get(i).getMealDescription() + " " + "(R"
						+ customerRestuarant.getMeals().get(i).getMealCost() + ")" + "\n";
			}
		}
		return info;
	}
//Create a method to get the total of the order 
// Implementing the applicable getters for this class
	public double getTotalOfOrder() {
		setTotalOfOrder();
		return totalOfOrder;
	}

	//Create a method to set the driver
	public void setDriver(String driver) {
		this.driver = driver;
	}

	//Create a method to get the driver 
	public String getDriver() {
		return driver;
	}

	//Create a method to get the order number
	public int getOrderNumber() {
		return orderNumber;
	}

	//Create a method to generate the order to the invoice.txt file
	public String generateInvoice() {
		return "Order number: " + this.orderNumber + "\n" + "Customer: " + customerDetails.getCustomerName() + "\n"
				+ "Email: " + customerDetails.getCustomerEmailAddress() + "\n" + "Phone number: "
				+ customerDetails.getCustomerContactDetails() + "\n" + "Location: "
				+ customerDetails.getCustomerLocation() + "\n" + "\n" + "You have ordered the following from "
				+ customerRestuarant.getRestaurantName() + " in " + customerRestuarant.getRestaurantLocation() + "\n"
				+ "\n" + generateMealsOrdered() + "\n" + "Special instructions: " + generateSpecialInstructions() + "\n"
				+ "Total: R" + getTotalOfOrder() + "\n\n" + this.driver
				+ " is nearest to the restaurant and so (he/she) will be delivering your order to you at:" + "\n" + "\n"
				+ customerDetails.getCustomerAddress() + "\n\n"
				+ "If you need to contact the restaurant, their number is "
				+ customerRestuarant.getRestaurantContactDetails();

	}

}

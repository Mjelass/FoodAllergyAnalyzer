package main.java.controller;

import main.java.model.User;
import main.java.model.Food;

public class FoodController {
	public void createfood(String name, String[] ingridients, String[] allergies) {
		/* Create a new product and add to the database*/
	}
	
	public void deletefood(String name) {
		/* Delete a food from the database*/
		
		
	}
	public void editfoodinfo(String name, String[] ingridients, String[] allergies, Long price ) {
		/* edit product information from the data base*/
	}
	public void checkproduct(String name, String[] ingridients, String[] allergies, Long price ) {
		/* Allow user to view product information
		 * 
		 */
	}
	
	public void editallergy(String[] allergies, User user) {
		/* allow user to edit his allergy info*/
	}

}

package main.java.model;

public class Food {
	private String name;
	private String [] ingridients;
	private String [] allergies;
	private String Category;
	private Long Price;
	
	public Food(String name, String[] ingridients, String[] allergies, String Category, long Price) {
		super();
		this.name = name;
		this.ingridients = ingridients;
		this.allergies = allergies;
		this.Category = Category;
		this.Price = Price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getIngridients() {
		return ingridients;
	}
	public void setIngridients(String[] ingridients) {
		this.ingridients = ingridients;
	}
	public String[] getAllergies() {
		return allergies;
	}
	public void setAllergies(String[] allergies) {
		this.allergies = allergies;
	}
	public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        this.Price = price;
    }
    
    //private FoodDatabase foodDatabase;

    //public FoodController() {
        //this.foodDatabase = new FoodDatabase();
    //}
	
}

package main.java.model;

import java.util.List;

public class Food {
	private String name;
	private List<String> ingridients;
	private List<String> allergies;
	private String Category;
	private Long Price;
	
	public Food(String name, List<String> ingridients, List<String> allergies, String Category, long Price) {
		super();
		this.name = name;
		this.ingridients = ingridients;
		this.allergies = allergies;
		this.Category = Category;
		this.Price = Price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getIngridients() {
		return ingridients;
	}
	public void setIngridients(List<String> ingridients) {
		this.ingridients = ingridients;
	}
	public List<String> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}
	public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        this.Price = price;
    }


}

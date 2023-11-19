package main.java.repository;
import java.util.List;

import org.bson.Document;

import main.java.model.Food;

public interface FoodRepository {

	void addFood(Food newFood);

	void deleteFoodByName(String name);

	void UpdateFoodByName(String nameFoodToEdit,Food newFood);

	void checkFoodByName(String nameFoodTocheck);
}


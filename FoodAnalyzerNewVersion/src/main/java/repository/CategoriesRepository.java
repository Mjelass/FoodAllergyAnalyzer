package main.java.repository;

import java.util.List;

import main.java.model.Food;

public interface CategoriesRepository {

    List<List<Food>> getCategories();

    List<Food> getAllFoods();

    List<Food> getFoodsByCategory(String category);

}

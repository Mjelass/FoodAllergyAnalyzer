package main.java.repository;

import java.util.List;

import main.java.model.Food;

public interface CategoriesRepository {

    List<Food> getAllFoods();

	List<List<Food>> getAllCategories();

}

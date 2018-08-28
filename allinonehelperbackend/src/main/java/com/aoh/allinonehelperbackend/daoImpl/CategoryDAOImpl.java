package com.aoh.allinonehelperbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aoh.allinonehelperbackend.dao.CategoryDAO;
import com.aoh.allinonehelperbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();
		// adding first category
		category.setId(1);
		category.setName("Home Cleaning");
		category.setDescription("This is a Home cleaning");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// second category
		category = new Category();
		category.setId(2);
		category.setName("Sofa Cleaning");
		category.setDescription("This is a Sofa cleaning");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// third category
		category = new Category();
		category.setId(3);
		category.setName("Carpet Cleaning");
		category.setDescription("This is a carpet cleaning");
		category.setImageURL("CAT_3.png");

		categories.add(category);

		// fourth category
		category = new Category();
		category.setId(4);
		category.setName("Moving service");
		category.setDescription("This is a Moving service");
		category.setImageURL("CAT_4.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {
		//forEach loop
		for(Category category: categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}

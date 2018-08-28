package com.aoh.allinonehelperbackend.dao;

import java.util.List;

import com.aoh.allinonehelperbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();

	Category get(int id);
}

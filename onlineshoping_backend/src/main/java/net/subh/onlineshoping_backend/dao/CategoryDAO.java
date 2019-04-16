package net.subh.onlineshoping_backend.dao;

import java.util.List;

import net.subh.onlineshoping_backend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();//return list of category
		Category get(int id);//fetch a single category based on it's id.

}

package net.subh.onlineshoping_backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.subh.onlineshoping_backend.dao.CategoryDAO;
import net.subh.onlineshoping_backend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {	
	/*Spring Repository classes are autodetected by spring framework through classpath scanning.
	 *Spring @Repository annotation is used to indicate that the class provides the mechanism ,
	 *for storage, retrieval, search, update and delete operation on objects.	
	 *"categoryDAO" :Autowired in controller.
	 */
	private static List<Category> categories =new ArrayList<>();
	
	static{
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("some description for television!");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		//adding second category
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("some description for mobile!");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		//adding third category
		category = new Category();
		category.setId(3);
		category.setName("laptop");
		category.setDescription("some description for laptop!");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
	}
	
	
	@Override
	public List<Category> list() {
		
		return categories;
	}


	@Override
	public Category get(int id) {
		
		for(Category category : categories ){
			if(category.getId()==id)
				return category;
		}
		return null;
	}

}

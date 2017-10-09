package net.vsb.lanternbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.vsb.lanternbackend.dao.CategoryDAO;
import net.vsb.lanternbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Fantasy");
		category.setDescription("This is the description for fantasy");
		category.setImageurl("book.jpg");
		
		categories.add(category);
		
		
		//adding second category
				category.setId(2);
				category.setName("Fiction");
				category.setDescription("This is the description for fantasy");
				category.setImageurl("book_3.jpg");
				
				categories.add(category);
				
	
				
				
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}

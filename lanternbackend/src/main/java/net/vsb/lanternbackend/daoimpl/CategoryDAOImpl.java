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
		category.setImageurl("book_1.jpg");
		
		categories.add(category);
		
		
		//adding second category
		       category = new Category();
				category.setId(2);
				category.setName("Fiction");
				category.setDescription("This is the description for fiction");
				category.setImageurl("book_2.jpg");
				
				categories.add(category);
				
				//adding third category
			       category = new Category();
					category.setId(3);
					category.setName("Comics");
					category.setDescription("This is the description for Comics");
					category.setImageurl("book_3.jpg");
					
					categories.add(category);
					
					//adding fourth category
				       category = new Category();
						category.setId(4);
						category.setName("Biography");
						category.setDescription("This is the description for Biography");
						category.setImageurl("book_4.jpg");
						
						categories.add(category);
				
						//adding fifth category
					       category = new Category();
							category.setId(5);
							category.setName("Science And Tech");
							category.setDescription("This is the description for Section a");
							category.setImageurl("book_4.jpg");
							
							categories.add(category);
				
				
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
		}
		
		return null;
	}

	
	
}

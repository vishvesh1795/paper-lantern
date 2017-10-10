package net.vsb.lanternbackend.dao;

import java.util.List;

import net.vsb.lanternbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}

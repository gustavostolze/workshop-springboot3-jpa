package com.gustavostolze.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavostolze.course.entities.Category;
import com.gustavostolze.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		List<Category> list = categoryRepository.findAll();
		return list;
	}
	
	public Category findById(Long id) {
		Optional<Category> cat = categoryRepository.findById(id);
		return cat.get();
	}
}

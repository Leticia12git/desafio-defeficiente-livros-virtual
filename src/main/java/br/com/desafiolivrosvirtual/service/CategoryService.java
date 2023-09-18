package br.com.desafiolivrosvirtual.service;

import br.com.desafiolivrosvirtual.dtos.CategoryRequest;
import br.com.desafiolivrosvirtual.model.Category;
import br.com.desafiolivrosvirtual.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category create(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setName(categoryRequest.getName());
        return categoryRepository.save(category);
    }
}
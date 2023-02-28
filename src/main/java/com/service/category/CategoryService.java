package com.service.category;

import com.model.Category;
import com.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryIplm {
    @Autowired
    ICategoryRepo iCategoryRepo;

    @Override
    public List<Category> findAll() {
        return (List<Category>) iCategoryRepo.findAll();
    }

    @Override
    public void create(Category category) {
        iCategoryRepo.save(category);
    }

    @Override
    public void delete(int id) {
         iCategoryRepo.deleteById(id);
    }

    @Override
    public Category findById(int id) {
        return (Category) iCategoryRepo.findById(id).get();
    }
}

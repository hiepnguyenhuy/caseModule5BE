package com.controller;

import com.model.Category;
import com.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping
    public List<Category> showAllCategory(){
        return categoryService.findAll();
    }

    @PostMapping
    public void createCategory(@RequestBody Category category){
        categoryService.create(category);
    }

    @GetMapping("/{id}")
    public Category showEdit(@PathVariable int id){
        return categoryService.findById(id);
    }

    @PutMapping("/{id}")
    public void edit(@RequestBody Category category) {
        categoryService.create(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }
}

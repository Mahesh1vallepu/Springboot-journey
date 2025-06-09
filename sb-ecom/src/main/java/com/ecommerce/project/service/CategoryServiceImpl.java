package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import javax.tools.JavaCompiler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {

        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource not found"));
        categoryRepository.delete(category);

        return "Category with categoryId: " + categoryId + ", deleted successfully !!";

//        List<Category>categories = categoryRepository.findAll();
//        Category category = categories.stream()
//                .filter(c->c.getCategoryId().equals(categoryId))
//                .findFirst()
//                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource not found"));
//
//        categories.remove(category);
//        categoryRepository.delete(category);
//        categoryRepository.deleteById(categoryId);
//        return "Category with categoryId: " + categoryId + ", deleted successfully !!";
    }

    @Override
    public Category updateCategory(Long categoryId, Category category) {

        Category categoryUpdate = categoryRepository.findById(categoryId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Category not found"));

        category.setCategoryId(categoryId);
        categoryUpdate = categoryRepository.save(category);
        return categoryUpdate;

//        List<Category>categories = categoryRepository.findAll();
//
//        Optional<Category> optionalCategory = categories.stream()
//                .filter(c->c.getCategoryId().equals(categoryId))
//                .findFirst();
//
//        if(optionalCategory.isPresent()){
//            Category existingCategory = optionalCategory.get();
//            existingCategory.setCategoryName(category.getCategoryName());
//            Category categoryTemp =  categoryRepository.save(existingCategory);
//            return categoryTemp;
//        }
//        else{
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "category not found");
//        }
    }
}

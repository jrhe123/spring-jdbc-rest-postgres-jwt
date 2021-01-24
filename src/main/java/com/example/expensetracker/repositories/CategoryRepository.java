package com.example.expensetracker.repositories;

import com.example.expensetracker.domain.Category;
import com.example.expensetracker.exceptions.EtBadRequestException;
import com.example.expensetracker.exceptions.EtResourceNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}

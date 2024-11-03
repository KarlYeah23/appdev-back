package com.dalangin.ecom.service.admin;

import com.dalangin.ecom.dto.CategoryDto;
import com.dalangin.ecom.entity.Category;

import java.util.List;

public interface AdminCategoryService {

    Category createCategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}

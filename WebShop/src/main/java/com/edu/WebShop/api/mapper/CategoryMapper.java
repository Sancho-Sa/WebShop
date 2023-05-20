package com.edu.WebShop.api.mapper;

import com.edu.WebShop.api.model.CategoryDTO;
import com.edu.WebShop.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);
}

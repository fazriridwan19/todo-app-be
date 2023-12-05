package com.ursklap.todoserver.services;

import com.ursklap.todoserver.models.Category;
import com.ursklap.todoserver.services.base.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService extends BaseService<Category, Integer> {
}

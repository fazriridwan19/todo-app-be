package com.ursklap.todoserver.repositories;

import com.ursklap.todoserver.models.Category;
import com.ursklap.todoserver.repositories.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends BaseRepository<Category, Integer> {
}

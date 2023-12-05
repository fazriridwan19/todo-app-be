package com.ursklap.todoserver.controllers;

import com.ursklap.todoserver.models.Category;
import com.ursklap.todoserver.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
  private CategoryService categoryService;

  @PostMapping
  public ResponseEntity<Category> create(@RequestBody Category category) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(categoryService.create(category));
  }

  @GetMapping
  public ResponseEntity<List<Category>> getAll() {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(categoryService.getAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Category> getById(@PathVariable Integer id) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(categoryService.getById(id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Category> update(@PathVariable Integer id, @RequestBody Category category) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(categoryService.update(id, category));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Category> delete(@PathVariable Integer id) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(categoryService.delete(id));
  }
}

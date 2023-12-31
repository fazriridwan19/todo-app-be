package com.ursklap.todoserver.controllers;

import com.ursklap.todoserver.models.Task;
import com.ursklap.todoserver.models.dto.TaskFilterKey;
import com.ursklap.todoserver.models.dto.TaskSearchCriteria;
import com.ursklap.todoserver.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
  private TaskService taskService;

  @PostMapping
  public ResponseEntity<Task> create(@RequestBody Task category) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.create(category));
  }

//  @GetMapping
//  public ResponseEntity<List<Task>> getAll(@RequestBody(required = false) Optional<TaskFilterKey> taskFilterKey) {
//    return ResponseEntity
//            .status(HttpStatus.OK)
//            .body(taskService.getAll(taskFilterKey));
//  }

  @GetMapping
  public ResponseEntity<Page<Task>> getAll(TaskSearchCriteria taskSearchCriteria) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.getAll(taskSearchCriteria));
  }

  @GetMapping("/{id}")
  public ResponseEntity<Task> getById(@PathVariable Integer id) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.getById(id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Task> update(@PathVariable Integer id, @RequestBody Task category) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.update(id, category));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Task> delete(@PathVariable Integer id) {
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(taskService.delete(id));
  }
}

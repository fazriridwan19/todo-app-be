package com.ursklap.todoserver.services;

import com.ursklap.todoserver.models.Category;
import com.ursklap.todoserver.models.Priority;
import com.ursklap.todoserver.models.Task;
import com.ursklap.todoserver.models.dto.TaskFilterKey;
import com.ursklap.todoserver.models.dto.TaskSearchCriteria;
import com.ursklap.todoserver.repositories.TaskRepository;
import com.ursklap.todoserver.services.base.BaseService;
import com.ursklap.todoserver.utils.TaskSpec;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class TaskService extends BaseService<Task, Integer> {
  private TaskRepository taskRepository;
  private CategoryService categoryService;
  private PriorityService priorityService;
  private ModelMapper modelMapper;

  public Page<Task> getAll(TaskSearchCriteria criteria) {
    TaskFilterKey taskFilterKey = TaskFilterKey.builder()
            .category(criteria.getCategoryId() == null ? null : categoryService.getById(criteria.getCategoryId()))
            .priority(criteria.getPriorityId() == null ? null : priorityService.getById(criteria.getPriorityId()))
            .isDone(criteria.getIsDone())
            .build();
    Specification<Task> spec = TaskSpec.filterBy(taskFilterKey);
    return taskRepository.findAll(spec, PageRequest.of(criteria.getPage(), criteria.getSize()));
  }
}

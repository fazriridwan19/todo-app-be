package com.ursklap.todoserver.utils;

import com.ursklap.todoserver.models.Category;
import com.ursklap.todoserver.models.Priority;
import com.ursklap.todoserver.models.Task;
import com.ursklap.todoserver.models.dto.TaskFilterKey;
import org.springframework.data.jpa.domain.Specification;

public class TaskSpec {
  public static final String IS_DONE = "isDone";
  public static final String CATEGORY = "category";
  public static final String PRIORITY = "priority";

  private TaskSpec() {}

  public static Specification<Task> filterBy(TaskFilterKey taskFilterKey) {
    return Specification
            .where(hasCategory(taskFilterKey.getCategory()))
            .and(hasDone(taskFilterKey.getIsDone()))
            .and(hasPriority(taskFilterKey.getPriority()));
  }

  private static Specification<Task> hasDone(Boolean isDone) {
    return ((root, query, criteriaBuilder) -> isDone == null ? criteriaBuilder.conjunction() : criteriaBuilder.equal(root.get(IS_DONE), isDone));
  }

  private static Specification<Task> hasCategory(Category category) {
    return ((root, query, criteriaBuilder) -> category == null ? criteriaBuilder.conjunction() : criteriaBuilder.equal(root.get(CATEGORY), category));
  }

  private static Specification<Task> hasPriority(Priority priority) {
    return ((root, query, criteriaBuilder) -> priority == null ? criteriaBuilder.conjunction() : criteriaBuilder.equal(root.get(PRIORITY), priority));
  }
}

package com.ursklap.todoserver.models.dto;

import com.ursklap.todoserver.models.Category;
import com.ursklap.todoserver.models.Priority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskFilterKey {
  private Category category;
  private Priority priority;
  private Boolean isDone;
}

package com.ursklap.todoserver.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskSearchCriteria {
  private Integer categoryId;
  private Integer priorityId;
  private Boolean isDone;
  private Integer page = 0;
  private Integer size = 4;
}

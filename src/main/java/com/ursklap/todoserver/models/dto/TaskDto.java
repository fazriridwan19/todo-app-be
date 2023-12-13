package com.ursklap.todoserver.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
  private String text;
  private Integer categoryId;
  private Integer priorityId;
  private Boolean isDone;
}

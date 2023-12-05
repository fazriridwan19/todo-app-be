package com.ursklap.todoserver.models;

import com.ursklap.todoserver.models.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
public class Task extends BaseEntity {
  @Column(columnDefinition = "TEXT")
  private String text;
  private Boolean isDone = false;
  @ManyToOne
  @JoinColumn(name = "category")
  private Category category;
  @ManyToOne
  @JoinColumn(name = "priority")
  private Priority priority;
}

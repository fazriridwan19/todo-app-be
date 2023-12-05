package com.ursklap.todoserver.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ursklap.todoserver.models.base.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "priorities")
public class Priority extends BaseEntity {
  private String name;
  @OneToMany(mappedBy = "priority", cascade = CascadeType.ALL)
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private List<Task> tasks;
}

package com.ursklap.todoserver.repositories;

import com.ursklap.todoserver.models.Task;
import com.ursklap.todoserver.repositories.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends BaseRepository<Task, Integer>, JpaSpecificationExecutor<Task> {
}

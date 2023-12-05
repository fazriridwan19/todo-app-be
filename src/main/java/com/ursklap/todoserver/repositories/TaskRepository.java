package com.ursklap.todoserver.repositories;

import com.ursklap.todoserver.models.Task;
import com.ursklap.todoserver.repositories.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends BaseRepository<Task, Integer> {
}

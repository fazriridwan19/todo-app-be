package com.ursklap.todoserver.repositories;

import com.ursklap.todoserver.models.Priority;
import com.ursklap.todoserver.repositories.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepository extends BaseRepository<Priority, Integer> {
}

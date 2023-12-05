package com.ursklap.todoserver.services;

import com.ursklap.todoserver.models.Priority;
import com.ursklap.todoserver.services.base.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PriorityService extends BaseService<Priority, Integer> {
}

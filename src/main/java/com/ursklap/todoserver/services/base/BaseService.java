package com.ursklap.todoserver.services.base;

import com.ursklap.todoserver.models.base.BaseEntity;
import com.ursklap.todoserver.repositories.base.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Primary
public class BaseService<E extends BaseEntity, T> {
  @Autowired
  private BaseRepository<E, T> repository;

  public List<E> getAll() {
    return repository.findAll();
  }

  public E getById(T id) {
    return repository
            .findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity is not found"));
  }

  public E create(E entity) {
    return repository.save(entity);
  }

  public E update(T id, E entity) {
    getById(id);
    entity.setId((Integer) id);
    return repository.save(entity);
  }

  public E delete(T id) {
    E entity = getById(id);
    repository.delete(entity);
    return entity;
  }
}

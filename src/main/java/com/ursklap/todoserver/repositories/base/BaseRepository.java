package com.ursklap.todoserver.repositories.base;

import com.ursklap.todoserver.models.base.BaseEntity;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface BaseRepository<E extends BaseEntity, T> extends JpaRepository<E, T> {
}

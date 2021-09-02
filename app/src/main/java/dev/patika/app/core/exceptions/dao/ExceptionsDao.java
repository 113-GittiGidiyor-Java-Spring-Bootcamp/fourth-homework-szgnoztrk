package dev.patika.app.core.exceptions.dao;

import dev.patika.app.core.exceptions.entity.Exception;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionsDao extends CrudRepository<Exception, Long> {
}

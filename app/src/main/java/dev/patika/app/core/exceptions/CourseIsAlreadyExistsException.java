package dev.patika.app.core.exceptions;

import dev.patika.app.core.exceptions.dao.ExceptionsDao;
import dev.patika.app.core.exceptions.entity.Exception;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseIsAlreadyExistsException extends RuntimeException{
    @Autowired
    private ExceptionsDao exceptionsDao;
    public CourseIsAlreadyExistsException(Exception exception) {
        super(exception.getMessage());
        this.exceptionsDao.save(exception);
    }
}

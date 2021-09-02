package dev.patika.app.core.exceptions;

import dev.patika.app.core.exceptions.dao.ExceptionsDao;
import dev.patika.app.core.exceptions.entity.Exception;
import org.springframework.beans.factory.annotation.Autowired;

public class InstructorIsAlreadyExistsException extends RuntimeException {
    @Autowired
    private ExceptionsDao exceptionsDao;
    public InstructorIsAlreadyExistsException(Exception exception) {
        super(exception.getMessage());
        this.exceptionsDao.save(exception);
    }
}

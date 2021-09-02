package dev.patika.app.core.exceptions;

import dev.patika.app.core.exceptions.dao.ExceptionsDao;
import dev.patika.app.core.exceptions.entity.Exception;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentAgeNotValidException extends RuntimeException {
    @Autowired
    private ExceptionsDao exceptionsDao;
    public StudentAgeNotValidException(Exception exception) {
        super(exception.getMessage());
        this.exceptionsDao.save(exception);
    }
}

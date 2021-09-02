package dev.patika.app.core.exceptions;

import dev.patika.app.core.exceptions.dao.ExceptionsDao;
import dev.patika.app.core.exceptions.entity.Exception;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentNumberForOneExceededException extends RuntimeException{
    @Autowired
    private ExceptionsDao exceptionsDao;
    public StudentNumberForOneExceededException(Exception exception) {
        super(exception.getMessage());
        this.exceptionsDao.save(exception);
    }
}

package pro.sky.java.course2.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDivideException extends IllegalArgumentException {
    public ZeroDivideException() {
        super("Ошибка деления на ноль");
    }

}

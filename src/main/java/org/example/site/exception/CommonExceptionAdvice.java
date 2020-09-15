package org.example.site.exception;

import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Log4j
public class CommonExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    public String except(Exception e, Model model) {

        log.info("Exception..."+e.getMessage());
        model.addAttribute("exception", e);
        log.info(model);

        return "error/exception";
    }
}

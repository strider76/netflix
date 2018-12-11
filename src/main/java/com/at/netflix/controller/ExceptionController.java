package com.at.netflix.controller;

import com.at.netflix.dto.ErrorDTO;
import com.at.netflix.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = {"com.at.netflix.controller"})
public class ExceptionController {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorDTO>  controlError(Exception ex) {
        return new ResponseEntity<>(new ErrorDTO("404",ex.getMessage()), HttpStatus.NOT_FOUND);
    }

}

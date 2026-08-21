package com.xideral.crudpeliculasmongo.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(PeliculaException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(PeliculaException ex) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", ex.getHttpStatus().value());
        body.put("error", ex.getHttpStatus());
        body.put("message", ex.getMessage());

        return new ResponseEntity<>(body, ex.getHttpStatus());
    }
}

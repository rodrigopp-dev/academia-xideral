package com.xideral.crudpeliculasmongo.exception;

import org.springframework.http.HttpStatus;

public class PeliculaException extends RuntimeException {

	private static final long serialVersionUID = 8767708563116787840L;
	private final HttpStatus httpStatus;

	public PeliculaException(String mensaje, HttpStatus httpStatus) {
        super(mensaje);
        this.httpStatus = httpStatus;
    }

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
}

package com.example.region_service.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> handleBusiness(BusinessException e) {
        ErrorCode ec = e.getErrorCode();

        ErrorResponse body = ErrorResponse.builder()
                .code(ec.getCode())
                .message(e.getMessage())
                .status(ec.getHttpStatus().value())
                .details(e.getDetails())
                .build();

        return ResponseEntity.status(ec.getHttpStatus()).body(body);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgument(IllegalArgumentException e) {
        ErrorCode ec = ErrorCode.INVALID_REQUEST;

        ErrorResponse body = ErrorResponse.builder()
                .code(ec.getCode())
                .message(e.getMessage() == null ? ec.getDefaultMessage() : e.getMessage())
                .status(ec.getHttpStatus().value())
                .details(null)
                .build();

        return ResponseEntity.status(ec.getHttpStatus()).body(body);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleAny(Exception e, HttpServletRequest request) {
        log.error("Unhandled exception. path={}, message={}", request.getRequestURI(), e.getMessage(), e);

        ErrorCode ec = ErrorCode.INTERNAL_ERROR;

        ErrorResponse body = ErrorResponse.builder()
                .code(ec.getCode())
                .message(ec.getDefaultMessage())
                .status(ec.getHttpStatus().value())
                .details(null)
                .build();

        return ResponseEntity.status(ec.getHttpStatus()).body(body);
    }
}
package lk.ijse.aad.backend.exception;

import lk.ijse.aad.backend.util.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.support.MetaDataAccessException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice

public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity handleGenericException(Exception e){
        return new ResponseEntity<>(new APIResponse<>
                (HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), null
                ),HttpStatus.INTERNAL_SERVER_ERROR);


    }

@ExceptionHandler
    public ResponseEntity<APIResponse<String>> handleNullPointerException(Exception e){
        return new ResponseEntity<>(new APIResponse<>(
                HttpStatus.BAD_REQUEST.value(),
                "Null Values are not allowed",
                e.getMessage()
        ),HttpStatus.BAD_REQUEST);

}

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<APIResponse<Map<String,String>>> handleValidationException(MethodArgumentNotValidException e){

        Map<String, String> errors = new HashMap<>();

        e.getBindingResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(), error.getDefaultMessage());
        });

        return new ResponseEntity<>(
                new APIResponse<>(
                        HttpStatus.BAD_REQUEST.value(),
                        "Validation Failed",
                        errors
                ),
                HttpStatus.BAD_REQUEST
        );
    }

}

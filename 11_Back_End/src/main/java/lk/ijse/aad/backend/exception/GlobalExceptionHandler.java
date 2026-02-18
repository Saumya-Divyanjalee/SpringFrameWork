package lk.ijse.aad.backend.exception;

import lk.ijse.aad.backend.util.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Handle our known business exceptions (404s, stock issues, etc.)
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<APIResponse<Void>> handleCustomException(CustomException e) {
        return new ResponseEntity<>(
                new APIResponse<>(HttpStatus.BAD_REQUEST.value(), e.getMessage(), null),
                HttpStatus.BAD_REQUEST
        );
    }

    // Handle @Valid annotation failures — returns field-level errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<APIResponse<Map<String, String>>> handleValidationException(
            MethodArgumentNotValidException e) {
        Map<String, String> errors = new HashMap<>();
        e.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );
        return new ResponseEntity<>(
                new APIResponse<>(HttpStatus.BAD_REQUEST.value(), "Validation Failed", errors),
                HttpStatus.BAD_REQUEST
        );

    }

    // Catch-all for unexpected errors — do NOT expose raw stack traces in production
    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIResponse<Void>> handleGenericException(Exception e) {
        return new ResponseEntity<>(
                new APIResponse<>(
                        HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        "An unexpected error occurred: " + e.getMessage(),
                        null),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
package lk.ijse.aad.security_backend.controller;

import lk.ijse.aad.security_backend.dto.APIResponse;
import lk.ijse.aad.security_backend.dto.AuthDTO;
import lk.ijse.aad.security_backend.dto.RegisterDTO;
import lk.ijse.aad.security_backend.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {
    private final AuthService authService;



    @PostMapping("register")
    public ResponseEntity<APIResponse> registerUser(@RequestBody RegisterDTO registerDTO) {
        return ResponseEntity.ok(new APIResponse
                (200,"OK",authService.register(registerDTO)));
    }
    @PostMapping("login")
    public ResponseEntity<APIResponse> loginUser(@RequestBody AuthDTO authDTO) {
        return ResponseEntity.ok(new APIResponse(
                200,"OK",authService.authenticate(authDTO)
        ));
    }

}

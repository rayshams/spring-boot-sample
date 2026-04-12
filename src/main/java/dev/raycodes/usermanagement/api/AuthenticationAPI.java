package dev.raycodes.usermanagement.api;

import dev.raycodes.usermanagement.api.request.RegisterRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthenticationAPI {

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest request) {
        log.info("Registering user with name: {}, email: {}", request.name(), request.email());
        return ResponseEntity.ok().build();
    }

}

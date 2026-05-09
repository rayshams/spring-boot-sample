package dev.raycodes.usermanagement.service;

import dev.raycodes.usermanagement.entity.User;
import dev.raycodes.usermanagement.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public User register(String name, String email, String password) {
        String hashedPassword = passwordEncoder.encode(password);
        return  userRepo.save(new User(null, name, email, hashedPassword));
    }

}

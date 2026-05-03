package dev.raycodes.usermanagement.service;

import dev.raycodes.usermanagement.entity.User;
import dev.raycodes.usermanagement.repository.UserRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepo userRepo;

    public User register(String name, String email, String password) {
        return  userRepo.save(new User(null, name, email, password));
    }

}

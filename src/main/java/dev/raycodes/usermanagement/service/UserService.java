package dev.raycodes.usermanagement.service;

import dev.raycodes.usermanagement.entity.User;
import dev.raycodes.usermanagement.repository.UserRepo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

}

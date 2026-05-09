package dev.raycodes.usermanagement.api;

import dev.raycodes.usermanagement.api.Dto.UserDto;
import dev.raycodes.usermanagement.entity.User;
import dev.raycodes.usermanagement.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Slf4j
@RequiredArgsConstructor
public class AdminAPI {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        log.info("Getting all users");
        List<UserDto> users = userService.getAllUsers()
                .stream()
                .map(UserDto::from)
                .toList();
        return ResponseEntity.status(200).body(users);
    }
}

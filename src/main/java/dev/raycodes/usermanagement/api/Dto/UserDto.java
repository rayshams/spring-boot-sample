package dev.raycodes.usermanagement.api.Dto;

import dev.raycodes.usermanagement.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;

    public static UserDto from(User u) {
        return new UserDto(u.getId(), u.getName(), u.getEmail());
    }
}

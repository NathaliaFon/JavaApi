package com.user.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity postUser(@RequestBody UserDto userDto) {

        User user = new User();
        user.setName(userDto.getName());
        user.setCpf(userDto.getCpf());

        return ResponseEntity.ok().body("jorge");

    }
}

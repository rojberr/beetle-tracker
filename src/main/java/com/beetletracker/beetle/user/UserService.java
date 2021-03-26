package com.beetletracker.beetle.user;

import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {
    User findByEmail(String email);
    void registerUser(User user);
}

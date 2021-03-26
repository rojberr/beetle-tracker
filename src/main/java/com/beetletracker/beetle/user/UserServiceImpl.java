package com.beetletracker.beetle.user;

import com.beetletracker.beetle.role.Role;
import com.beetletracker.beetle.role.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final RoleService roleService;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public User findByEmail(String email) {
        return userRepository.findFirstByEmail(email).orElseThrow(()->
                new IllegalStateException("User with email "+email+"does not exists"));
    }

    @Override
    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        user.setCreationDate(LocalDate.now());

        Set<Role> roles = new HashSet<>();
        Role role = roleService.findByRole("ROLE_USER");
        roles.add(role);
        user.setRoles(roles);

        userRepository.save(user);
    }
}

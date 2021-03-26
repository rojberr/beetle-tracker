package com.beetletracker.beetle.role;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;

    @Override
    public Role findByRoleType(RoleType roleType) {
        String role = "ROLE_"+roleType.toString();
        return roleRepository.findByRole(role)
                .orElseThrow(()->new IllegalStateException("Role "+role+" does not exists!"));
    }
}

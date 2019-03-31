package com.example.demo.service;

import com.example.demo.entity.Role;

import java.util.Optional;

public interface RoleService {
    Role saveRole(Role role);
    Optional<Role> getRoleById(Long id);
    Iterable<Role> getAllRoles();
    void deleteRole(Long id);
}

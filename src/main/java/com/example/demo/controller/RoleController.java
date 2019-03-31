package com.example.demo.controller;


import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping(value = "")
    public ResponseEntity<Role> getRoleById(@PathVariable(name = "id") Long id) {

        Optional<Role> role = roleService.getRoleById(id);

        if (role.isPresent()) {
            return ResponseEntity.ok(role.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/all")
    public Iterable<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping
    public Role saveRole(@RequestBody Role account) {
        return roleService.saveRole(account);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteRole(@PathVariable(name = "id") Long id) {
        roleService.deleteRole(id);
        return ResponseEntity.noContent().build();
    }

}

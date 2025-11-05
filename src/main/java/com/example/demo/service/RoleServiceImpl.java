package com.example.demo.service;

import com.example.demo.domainmodel.Role;
import com.example.demo.domainmodel.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Role> findRoleByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRoleById(Long id) {
        this.roleRepository.deleteRoleById(id);
    }

    @Override
    public Role partialUpdateRole(Role role) {
        return roleRepository.save(role);
    }
}

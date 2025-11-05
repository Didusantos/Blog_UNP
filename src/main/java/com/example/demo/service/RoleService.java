package com.example.demo.service;

import com.example.demo.domainmodel.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAllRoles();

    public Role findRoleById(Long id);

    public List<Role> findRoleByName(String name);

    public Role  createRole(Role role);

    public Role  updateRole(Role role);

    public void deleteRoleById(Long id);

    public Role partialUpdateRole(Role role);
}

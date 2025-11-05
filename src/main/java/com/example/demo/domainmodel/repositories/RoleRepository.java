package com.example.demo.domainmodel.repositories;

import com.example.demo.domainmodel.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {

    public List<Role> findByName(String name);

    public Optional<Role> findById(long id);

    public List<Role> findAll();

    void deleteRoleById(long id);
}

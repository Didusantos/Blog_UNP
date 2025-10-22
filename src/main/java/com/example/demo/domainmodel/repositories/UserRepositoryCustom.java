package com.example.demo.domainmodel.repositories;

import com.example.demo.domainmodel.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryCustom<User, UUID> {
    public Optional<User> findByIdWithProfileAndPostsCriteria(UUID id);

    public List<User> findByMinRolesAndNameLikeCriteria(int minRoles, String name);
}
